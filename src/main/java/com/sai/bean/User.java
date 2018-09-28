package com.sai.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name="userdata")
	public class User {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 
	 @Column(name = "col1")
	 private String  col1;
	 @Column(name = "col2")
	 private String  col2;
	 @Column(name = "col3")
	 private String  col3;
	 @Column(name = "col4")
	 private String  col4;
	 @Column(name = "col5")
	 private String  col5;
	 @Column(name = "col6")
	 private String  col6;
	 @Column(name = "col7")
	 private String  col7;
	 @Column(name = "col8")
	 private String  col8;
	 @Column(name = "col9")
	 private String  col9;
	 @Column(name = "col10")
	 private String  col10;
	@Override
	public String toString() {
		return "User [id=" + id + ", col1=" + col1 + ", col2=" + col2 + ", col3=" + col3 + ", col4=" + col4 + ", col5="
				+ col5 + ", col6=" + col6 + ", col7=" + col7 + ", col8=" + col8 + ", col9=" + col9 + ", col10=" + col10
				+ "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String col1, String col2, String col3, String col4, String col5, String col6, String col7,
			String col8, String col9, String col10) {
		super();
		this.id = id;
		this.col1 = col1;
		this.col2 = col2;
		this.col3 = col3;
		this.col4 = col4;
		this.col5 = col5;
		this.col6 = col6;
		this.col7 = col7;
		this.col8 = col8;
		this.col9 = col9;
		this.col10 = col10;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCol1() {
		return col1;
	}
	public void setCol1(String col1) {
		this.col1 = col1;
	}
	public String getCol2() {
		return col2;
	}
	public void setCol2(String col2) {
		this.col2 = col2;
	}
	public String getCol3() {
		return col3;
	}
	public void setCol3(String col3) {
		this.col3 = col3;
	}
	public String getCol4() {
		return col4;
	}
	public void setCol4(String col4) {
		this.col4 = col4;
	}
	public String getCol5() {
		return col5;
	}
	public void setCol5(String col5) {
		this.col5 = col5;
	}
	public String getCol6() {
		return col6;
	}
	public void setCol6(String col6) {
		this.col6 = col6;
	}
	public String getCol7() {
		return col7;
	}
	public void setCol7(String col7) {
		this.col7 = col7;
	}
	public String getCol8() {
		return col8;
	}
	public void setCol8(String col8) {
		this.col8 = col8;
	}
	public String getCol9() {
		return col9;
	}
	public void setCol9(String col9) {
		this.col9 = col9;
	}
	public String getCol10() {
		return col10;
	}
	public void setCol10(String col10) {
		this.col10 = col10;
	}
	
	 
	 
	}