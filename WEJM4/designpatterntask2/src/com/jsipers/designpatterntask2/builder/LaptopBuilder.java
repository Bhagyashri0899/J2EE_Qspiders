package com.jsipers.designpatterntask2.builder;

import com.jsipers.designpatterntask2.laptop.Laptop;

public class LaptopBuilder {
	 private String brand;
	   private int displaySize;
	   private int ram;
	   private int storageType;
	   private int graphicCard;
	   private int displayResolution;
	   private int price;
	   private int warranty;
	   private double discount;
	    
	   public LaptopBuilder brand(String brand) {
		   this.brand=brand;
		   return this;
	   }
	   public LaptopBuilder displaySize(int displaySize) {
		   this.displaySize=displaySize;
		   return this;
	   }
	   public LaptopBuilder ram(int ram) {
		   this.ram=ram;
		   return this;
	   }
	   public LaptopBuilder storageType(int storageType) {
		   this.storageType=storageType;
		   return this;
	   }
	   public LaptopBuilder graphicCard(int graphicCard) {
		   this.graphicCard=graphicCard;
		   return this;
	   }
	   public LaptopBuilder displayResolution(int displayResolution) {
		   this.displayResolution=displayResolution;
		   return this;
	   }

	   public LaptopBuilder price(int price) {
		   this.price=price;
		   return this;
	   }
	   public LaptopBuilder warranty(int warranty) {
		   this.warranty=warranty;
		   return this;
	   }
	   public LaptopBuilder discount(int discount) {
		   this.discount=discount;
		   return this;
	   }
  public Laptop getLaptop(){
  	Laptop  laptop=new Laptop(this.displaySize,this.ram, this.storageType,
  			                  this.graphicCard, this.displayResolution, this.price,
  			                  this.warranty, this.discount, this.brand);
  	 return laptop; 
  }
}
