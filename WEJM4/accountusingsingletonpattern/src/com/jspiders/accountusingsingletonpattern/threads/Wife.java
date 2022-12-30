package com.jspiders.accountusingsingletonpattern.threads;

import com.jspiders.accountusingsingletonpattern.resources.Account;

public class Wife extends Thread{
	static Account account;
	
	static Wife wife=new Wife();
	
	private Wife() 
	{
	}

	public static Wife getwife()
	{
		return wife;
		
	}
	
	public static void givingaddwife(Account acc) {
		account=acc;
	}
	
	public void run() {
		account.deposite(3000);
		account.withdraw(8000);
	}

}
