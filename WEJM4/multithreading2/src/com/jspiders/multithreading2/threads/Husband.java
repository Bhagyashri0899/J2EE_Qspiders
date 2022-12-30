package com.jspiders.multithreading2.threads;

import com.jspiders.multithreading2.resources.Account;

public class Husband extends Thread{
         Account account;

		public Husband(Account account) {
			super();
			this.account = account;
		}
         
         @Override
        public void run() {
           account.deposite(5000);
           account.withdraw(7000);
        }
}
