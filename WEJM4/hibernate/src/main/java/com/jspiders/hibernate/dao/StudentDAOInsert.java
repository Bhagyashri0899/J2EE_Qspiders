//Code Standardization

package com.jspiders.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dto.StudentDTO;

public class StudentDAOInsert {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("student");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}
	
	private static void closeConnection() {
		if(factory != null) {
			factory.close();
		}
		if(manager != null) {
			manager.close();
		}
		if(transaction.isActive()) {
			transaction.rollback();
		}
	}
	
	
	public static void main(String[] args) {
		openConnection();
		transaction.begin();
		
		StudentDTO student = new StudentDTO();
		        student.setId(1);
		        student.setName("Aboli");
		        student.setEmail("aboli@gmail.com");
		        student.setContact(1234567890L);
		        student.setCity("pune");
		        
		        manager.persist(student);
		        transaction.commit();
		        
		        closeConnection();
	}

}
