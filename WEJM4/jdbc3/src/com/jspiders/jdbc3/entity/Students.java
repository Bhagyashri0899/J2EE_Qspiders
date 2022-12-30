package com.jspiders.jdbc3.entity;

public class Students {
	private int id;
	private String name;
	private String email;
	private Long cantact;
	private String city;
	
	//getter ana setter method
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getCantact() {
		return cantact;
	}
	public void setCantact(Long cantact) {
		this.cantact = cantact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", email=" + email + ", cantact=" + cantact + ", city=" + city
				+ "]";
	}
	
	 

}
