package com.sai.bean;



public class Location {



	private String name;
		
	private String address;
		
	private String city;
	
	private String state;
	
	private float distance;

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Location(String name, String address, String city, String state, float distance) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Location [name=" + name + ", address=" + address + ", city=" + city + ", state=" + state + ", distance="
				+ distance + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}
		



	
}
