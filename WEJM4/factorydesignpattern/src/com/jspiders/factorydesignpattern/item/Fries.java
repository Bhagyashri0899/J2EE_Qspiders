package com.jspiders.factorydesignpattern.item;

import com.jspiders.factorydesignpattern.order.Order;

public class Fries implements Order{
	@Override
	public void orderItem() {
		System.out.println("Ordering Fries");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Fries REady");
	}
}
