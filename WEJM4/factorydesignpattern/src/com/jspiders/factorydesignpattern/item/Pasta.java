package com.jspiders.factorydesignpattern.item;

import com.jspiders.factorydesignpattern.order.Order;

public class Pasta implements Order{
	@Override
	public void orderItem() {
		System.out.println("Ordering Pasta");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Pasta REady");
	}

}
