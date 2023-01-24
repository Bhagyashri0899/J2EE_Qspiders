package com.jspiders.hibernate_onetoone_biderectional.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate_onetoone_biderectional.dto.HusbandeDTOBidirectional;
import com.jspiders.hibernate_onetoone_biderectional.dto.WifeDTOBidirectional;

public class HusbandWifeBidiredtional {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("OneToOne");
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
		
		WifeDTOBidirectional wife2 = new WifeDTOBidirectional() ;
		wife2.setId(2);
		wife2.setName("farah");
		wife2.setAge(23);
		
		
		manager.persist(wife2);
		
		HusbandeDTOBidirectional husband2=new HusbandeDTOBidirectional();
		husband2.setId(2);
		husband2.setName("uday");
		husband2.setAge(20);
		
		manager.persist(husband2);
		
		wife2.setHusband(husband2);
		husband2.setWife(wife2);
		
		transaction.commit();
		closeConnection();
		}

}
