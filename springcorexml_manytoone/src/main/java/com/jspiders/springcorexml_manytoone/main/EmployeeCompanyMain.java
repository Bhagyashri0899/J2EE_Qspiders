package com.jspiders.springcorexml_manytoone.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcorexml_manytoone.beans.EmployeeBean;

public class EmployeeCompanyMain {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("EmployeeCompanyConfig.xml");
		EmployeeBean employee1=(EmployeeBean)context.getBean("employee1");
		EmployeeBean employee2=(EmployeeBean)context.getBean("employee2");
		System.out.println(employee1);
		System.out.println(employee2);
		((ClassPathXmlApplicationContext)context).close();
	}

}
