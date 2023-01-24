package com.jspiders.accountusingsingletonpattern.main;

import com.jspiders.accountusingsingletonpattern.resources.Account;
import com.jspiders.accountusingsingletonpattern.threads.Husband;
import com.jspiders.accountusingsingletonpattern.threads.Wife;

public class AccountMain {
	public static void main(String[] args) {
		Husband.givingadd(Account.getobject());
		Wife.givingaddwife(Account.getobject());
		
		Husband husband=Husband.gethusband();
		Wife wife=Wife.getwife();
		
		husband.start();
		wife.start();
		
		}

}
