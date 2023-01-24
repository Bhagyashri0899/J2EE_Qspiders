package com.jspiders.springcoreannotation1.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentBean {
    private int id;
    private String name;
    private String email;
    private String city;
	
    


}
