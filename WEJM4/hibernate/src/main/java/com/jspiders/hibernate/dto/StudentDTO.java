package com.jspiders.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data

public class StudentDTO {
	@Id
	private int id;
	private String name;
	private String email;
	private Long contact;
	private String city;
	
	

}
