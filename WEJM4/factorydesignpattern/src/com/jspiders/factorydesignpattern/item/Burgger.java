package com.jspiders.factorydesignpattern.item;

import com.jspiders.factorydesignpattern.order.Order;

public class Burgger implements Order{
	@Override
	public void orderItem() {
		System.out.println("Ordering Burgger");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Burgger REady");
	}
}
