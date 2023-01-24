package com.jspiders.springcorexml_manytomany.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcorexml_manytomany.beans.MovieBean;

public class UserMovieMain_manyTOmany {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("UserMovieConfig.xml");
		MovieBean movie1=(MovieBean)context.getBean("movie1");
		MovieBean movie2=(MovieBean)context.getBean("movie2");
		System.out.println(movie1);
		System.out.println(movie2);
		((ClassPathXmlApplicationContext)context).close();
	}

}