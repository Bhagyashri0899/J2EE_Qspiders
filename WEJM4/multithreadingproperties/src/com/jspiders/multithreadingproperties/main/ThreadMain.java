package com.jspiders.multithreadingproperties.main;

import com.jspiders.multithreadingproperties.threads.MyThread1;

public class ThreadMain {

	public static void main(String[] args) {
		MyThread1 myThread1=new MyThread1();
		myThread1.setName("T1");
		myThread1.setPriority(7);

		myThread1.start();
	}

}
