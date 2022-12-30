package com.jspiders.builderdesignpattern.main;

import com.jspiders.builderdesignpattern.builder.MoblieBuilder;
import com.jspiders.builderdesignpattern.objects.Mobile;

public class MobileMain {
	public static void main(String[] args) {
		Mobile mobile = new MoblieBuilder().brand("Samsung").price(100000.00).model("S24").getMobile();
		
		System.out.println(mobile);
	}

}
