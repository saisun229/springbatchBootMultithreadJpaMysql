package com.sai.bean;



import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserRepository extends JpaRepository< User,Integer> {

	
	
	
	
	static final String HAVERSINE_PART = "(6371 * acos(cos(radians(:latitude)) * cos(radians(m.latitude)) * cos(radians(m.longitude) - radians(:longitude)) + sin(radians(:latitude)) * sin(radians(m.latitude))))";

	@Query("SELECT m, "+HAVERSINE_PART+" FROM User m WHERE "+HAVERSINE_PART+" < 100 ORDER BY "+HAVERSINE_PART+"ASC")
	public List<?> find(@Param("latitude") final double latitude, @Param("longitude") final double longitude);
	
}
