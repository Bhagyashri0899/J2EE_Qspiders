package com.jspiders.factorydesignpattern.main;

import java.util.Scanner;

import com.jspiders.factorydesignpattern.item.Burgger;
import com.jspiders.factorydesignpattern.item.Coffee;
import com.jspiders.factorydesignpattern.item.Fries;
import com.jspiders.factorydesignpattern.item.Momos;
import com.jspiders.factorydesignpattern.item.Pasta;
import com.jspiders.factorydesignpattern.item.Pizza;
import com.jspiders.factorydesignpattern.order.Order;

public class Cafe {
	
	private static Order order;
	private static boolean loop=true ,False;
	private static int choice;
	private static Scanner scanner= new Scanner(System.in);
	
	public static void main(String[] args) {
		while (loop) {
			try {
				factory().orderItem();
			} catch (NullPointerException e) {
				System.out.println(" No order received");
			}
		}
	}
	
	private static Order factory() {
		System.out.println("======MENU======\n" + "1.Pizza\n"
				+"2.Burger\n"
				+"3.Fries\n"
				+"4.Coffe\n"
				+"5.Momos\n"
				+"6.astza\n"
				+"7.Exit\n");
		choice= scanner.nextInt();
		
		switch (choice) {
		case 1:
			order = new Pizza();
			order=null;
			break;

		case 2:
			order = new Burgger();
			order=null;
			break;
			
		case 3:
			order = new Fries();
			order=null;
			break;
			
		case 4:
			order = new Coffee();
			order=null;
			break;
			
		case 5:
			order = new Momos();
			order=null;
			break;
			
		case 6:
			order = new Pasta();
			order=null;
			break;
			
		case 7:
			System.out.println("Thank you .. visit again");
			loop=False;
			break;
		default:
			System.out.println("Invalid choise");
			order=null;
			break;
		}
		return order;
	}
}
