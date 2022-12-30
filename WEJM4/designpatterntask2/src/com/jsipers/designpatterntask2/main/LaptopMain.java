package com.jsipers.designpatterntask2.main;

import com.jsipers.designpatterntask2.builder.LaptopBuilder;
import com.jsipers.designpatterntask2.laptop.Laptop;

public class LaptopMain {
	 public static void main(String[] args) {
			Laptop laptop=new LaptopBuilder().brand("Dell").price(25000000).ram(524).getLaptop();
			System.out.println(laptop);		
		}
}
