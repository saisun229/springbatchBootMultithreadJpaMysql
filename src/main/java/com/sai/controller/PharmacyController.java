package com.sai.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.sai.bean.UserRepository;


@RestController
@RequestMapping("/")
public class PharmacyController {

	@Autowired
	
	UserRepository userRepository;
	
    
	
	@RequestMapping(method=RequestMethod.POST, value="/location")
	public Object getData(@RequestParam("latitude") double latitude,
            @RequestParam("longitude") double longitude)
	{
		
		
		List<?> list = userRepository.find(latitude, longitude);
		return  list.get(0);
		
			}
	
}
