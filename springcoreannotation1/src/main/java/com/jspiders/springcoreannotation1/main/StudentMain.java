package com.jspiders.springcoreannotation1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcoreannotation1.beans.StudentBean;
import com.jspiders.springcoreannotation1.config.StudentConfig;

import lombok.Data;


public class StudentMain {
   public static void main(String[] args) {
	   ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentBean student = (StudentBean)context.getBean("student1");
		System.out.println(student);
		((AnnotationConfigApplicationContext)context).close();
	}
}