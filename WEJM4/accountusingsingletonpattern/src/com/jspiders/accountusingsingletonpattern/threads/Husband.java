package com.jspiders.accountusingsingletonpattern.threads;

import com.jspiders.accountusingsingletonpattern.resources.Account;

public class Husband extends Thread{
	static Account account;
	
	static Husband husband=new Husband();
	
	private Husband() {
		
	}

	public static Husband gethusband() {
		return husband;
		
	}
	
	public static void givingadd(Account acc) {
		account=acc;
	}
	
	public void run() {
		account.deposite(5000);
		account.withdraw(7000);
	}
}
