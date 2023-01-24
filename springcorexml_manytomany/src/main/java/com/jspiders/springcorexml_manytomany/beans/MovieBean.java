package com.jspiders.springcorexml_manytomany.beans;

import java.util.List;

import lombok.Data;

@Data
public class MovieBean {
	private int id;
	private String name;
	private List<UserBean> users;
}