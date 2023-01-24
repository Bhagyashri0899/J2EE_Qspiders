package com.jspiders.mulrithreadingwaitandnotify.main;

import com.jspiders.mulrithreadingwaitandnotify.resources.Shop;
import com.jspiders.mulrithreadingwaitandnotify.thread.Customer;
import com.jspiders.mulrithreadingwaitandnotify.thread.Supplier;

public class ShopMain {
     public static void main(String[] args) {
	     Shop shop=new Shop(100);
	     Customer customer1 = new Customer(shop , 50);
	     Customer customer2 = new Customer(shop , 50);
	     Supplier supplier = new Supplier(shop , 100);
	     
	     customer1.start();
	     customer2.start();
	    // supplier.start();
	     
	     
     }
}
