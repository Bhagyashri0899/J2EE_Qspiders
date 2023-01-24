package com.jspiders.springcoreannotation1.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.springcoreannotation1.beans.StudentBean;


public class StudentConfig {
	@Bean("student1")
	public StudentBean getStudent() {
		
	//	return new StudentBean(3, "Anita", "anita@gmail.com","Pune");
		
		StudentBean student = new StudentBean(3, "Anita", "anita@gmail.com","Pune");
		return student;
	}
	
	
}
