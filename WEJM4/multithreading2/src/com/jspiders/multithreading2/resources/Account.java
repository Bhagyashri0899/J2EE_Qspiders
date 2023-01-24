package com.jspiders.multithreading2.resources;

public class Account {
   int accountBalance;
	   
   public Account(int accountBalance) {
	super();
	this.accountBalance=accountBalance;
}
   
   public void deposite(int depositAmount) {
	   System.out.println("Depositing"+ depositAmount+ " rupees in the account");
	   accountBalance += depositAmount;
	   System.out.println("Available balance:" + accountBalance);
   }
   
   public void withdraw(int withdrawAmount) {
	   if (accountBalance>=withdrawAmount) {
		System.out.println("Withdrawing" + withdrawAmount + " from the account");
		
		accountBalance-=withdrawAmount;
		System.out.println("availble balance:" + accountBalance);
	   }
		else {
			System.out.println("Insufficient balance");
		}
	
   }
   
}
