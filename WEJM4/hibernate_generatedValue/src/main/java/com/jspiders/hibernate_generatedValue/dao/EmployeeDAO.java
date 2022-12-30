package com.jspiders.hibernate_generatedValue.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate_generatedValue.dto.EmployeeDTO;

public class EmployeeDAO {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	private static void openConnection() {
		factory = Persistence.
				createEntityManagerFactory("Employee");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}

	private static void closeConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		if (transaction.isActive()) {
			transaction.rollback();
		}
	}
	
	public static void main(String[] args) {
		
		openConnection();
		transaction.begin();
		
		EmployeeDTO employee1 = new EmployeeDTO();
		employee1.setName("jadu");
		employee1.setEmail("jadu@koimilgaya.com");
		employee1.setDesignation("alien");
		employee1.setSalary(10000);
		manager.persist(employee1);
		
		
		transaction.commit();
		closeConnection();
		
	}


}
