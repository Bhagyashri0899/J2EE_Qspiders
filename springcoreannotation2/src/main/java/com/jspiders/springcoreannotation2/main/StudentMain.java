package com.jspiders.springcoreannotation2.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcoreannotation2.beans.StudentBean;
import com.jspiders.springcoreannotation2.config.StudentConfig;

public class StudentMain {
	public static void main(String[] args) {
		   ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
			StudentBean student = (StudentBean)context.getBean("student2");
			System.out.println(student);
			((AnnotationConfigApplicationContext)context).close();
		}

}
