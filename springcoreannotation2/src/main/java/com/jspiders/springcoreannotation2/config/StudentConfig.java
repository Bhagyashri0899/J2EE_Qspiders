package com.jspiders.springcoreannotation2.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.springcoreannotation2.beans.StudentBean;

public class StudentConfig {
		@Bean("student2")
		public StudentBean getStudent2(){
			return new StudentBean();
	}

}
