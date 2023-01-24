package com.jspiders.springcorexml_onetoone.beans;

import lombok.Data;

@Data
public class HusbandBean {
	private int id;
	private String name;
	private int age;
	private WifeBean wife;

}
