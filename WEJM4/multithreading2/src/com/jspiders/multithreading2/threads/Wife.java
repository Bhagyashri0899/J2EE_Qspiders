package com.jspiders.multithreading2.threads;

import com.jspiders.multithreading2.resources.Account;

public class Wife  extends Thread{
	 Account account;

	public Wife(Account account) {
		super();
		this.account = account;
	}
	
	 @Override
     public void run() {
        account.deposite(3000);
        account.withdraw(8000);
     }

}
