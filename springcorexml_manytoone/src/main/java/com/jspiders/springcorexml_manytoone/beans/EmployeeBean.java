package com.jspiders.springcorexml_manytoone.beans;

import lombok.Data;

@Data
public class EmployeeBean {
	private int id;
	private String name;
	private int salary;
	private CompanyBean company;
	

}
