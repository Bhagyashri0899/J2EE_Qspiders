package com.jspiders.builderdesignpattern.builder;

import com.jspiders.builderdesignpattern.objects.Mobile;

public class MoblieBuilder {
	private String brand;
	private String model;
	private int ram;
	private int memory;
	private int front_cam;
	private int rear_cam;
	private double price;
	private int battery;
	private String color;
	private double processor;	

	public MoblieBuilder brand(String brand) {
		this.brand=brand;
		return this;
	}
	
	public MoblieBuilder model(String model) {
		this.model=model;
		return this;
	}
	
	public MoblieBuilder ram(int ram) {
		this.ram=ram;
		return this;
	}
	
	public MoblieBuilder memory(int memory) {
		this.memory=memory;
		return this;
	}
	
	public MoblieBuilder front_cam(int brand) {
		this.front_cam=front_cam;
		return this;
	}
	
	public MoblieBuilder rear_cam(int brand) {
		this.rear_cam=rear_cam;
		return this;
	}
	
	public MoblieBuilder price(double price) {
		this.price=price;
		return this;
	}
	
	public MoblieBuilder battery(int battery) {
		this.battery=battery;
		return this;
	}
	
	public MoblieBuilder color(String color) {
		this.color=color;
		return this;
	}
	
	public MoblieBuilder processor(double processor) {
		this.processor=processor;
		return this;
	}
	
	public Mobile getMobile() {
		Mobile mobile=new Mobile(this.brand,this.model,this.ram,this.memory,this.front_cam,
				                 this.rear_cam,this.price,this.battery,this.color,this.processor);
		return mobile;
		
		
	}
	
}
