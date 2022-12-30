package com.jspiders.hibernate_onetoone_biderectional.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class HusbandeDTOBidirectional {
	@Id
	int id;
	String name;
	int age;
	
	@OneToOne
	WifeDTOBidirectional wife;
	

}
