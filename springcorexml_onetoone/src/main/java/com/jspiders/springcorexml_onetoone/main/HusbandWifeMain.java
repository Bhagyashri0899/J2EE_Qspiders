package com.jspiders.springcorexml_onetoone.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcorexml_onetoone.beans.HusbandBean;

public class HusbandWifeMain {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("HusbandWifeConfig.xml");
		HusbandBean husband1 =context.getBean(HusbandBean.class);
		System.out.println(husband1);
		((ClassPathXmlApplicationContext)context).close();
	}

}
