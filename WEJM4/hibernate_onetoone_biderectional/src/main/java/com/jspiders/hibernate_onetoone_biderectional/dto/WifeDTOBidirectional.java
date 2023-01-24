package com.jspiders.hibernate_onetoone_biderectional.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class WifeDTOBidirectional {
	@Id
	int id;
	String name;
	int age;
	
	@OneToOne
	HusbandeDTOBidirectional husband;

}
