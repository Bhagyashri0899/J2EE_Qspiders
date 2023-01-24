package com.jspiders.springcorexml_onetomany.beans;

import java.util.List;

import lombok.Data;

@Data
public class FatherBean {
	private int id;
	private String name;
	private int age;
	private List<ChildBean> children;
}