package com.jspiders.accountusingsingletonpattern.resources;

public class Account {
	static Account object=new Account();
	static int accountBalance=10000;
	
	private Account() {
		
	}
	
	public static Account getobject() {
		return object;
		
	}
	
	public synchronized void deposite(int depositAmount) {
		System.out.println("Depositing" + depositAmount+ " rupees in the account");
		
		accountBalance +=depositAmount;
		System.out.println("Available Balance" +accountBalance);
	}
	
	public synchronized void withdraw(int withdrawAmount) {
		
		if(accountBalance>=withdrawAmount)
		{
		System.out.println("Withdrawing" + withdrawAmount+ " from the account the account");
		
		accountBalance -=withdrawAmount;
		System.out.println("Available Balance" +accountBalance);
	}else {
		System.out.println("insuficient balance");
	}
	}
}
