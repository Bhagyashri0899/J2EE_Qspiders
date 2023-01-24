package com.jspiders.springcoreannotation.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.springcoreannotation.beans.StudentBean;


public class StudentConfig {
	@Bean
	public StudentBean getStudent() {
	
	StudentBean student = new StudentBean();
	student.setId(1);
	student.setName("bhagyashri");
	student.setEmail("bhagya@gmail.com");
	student.setCity("pune");
	return (student);
	
	}
}
