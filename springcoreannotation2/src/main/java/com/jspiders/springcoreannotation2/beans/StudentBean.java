package com.jspiders.springcoreannotation2.beans;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentBean {
	
	@Value("1")
	private int id;
	
	@Value("Uday")
    private String name;
	
	@Value("uday@gmail.com")
    private String email;
	
	@Value("Pune")
    private String city;
	

}
