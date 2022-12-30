package com.jspiders.multithreading2.main;

import com.jspiders.multithreading2.resources.Account;
import com.jspiders.multithreading2.threads.Husband;
import com.jspiders.multithreading2.threads.Wife;

public class AccountMain {
	public static void main(String[] args) {
		 Account account=new Account(10000);
		 Husband husband=new Husband(account);
		 Wife wife = new Wife(account);
		 
		 husband.start();
		 wife.start();
	}

}
