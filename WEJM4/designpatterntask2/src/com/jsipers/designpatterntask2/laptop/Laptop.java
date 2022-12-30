package com.jsipers.designpatterntask2.laptop;

public class Laptop {
	 private String brand;
	   private int displaySize;
	   private int ram;
	   private int storageType;
	   private int graphicCard;
	   private int displayResolution;
	   private int price;
	   private int warranty;
	   private double discount;
	    public Laptop( int displaySize,int ram, int storageType,int graphicCard,
	    		     int displayResolution,int price,int warranty, double discount, String brand)
	    {
	    	super();
	    	this.brand=brand;
	    	this.displaySize=displaySize;
	    	this.ram=ram;
	    	this.storageType=storageType;
	    	this.graphicCard=graphicCard;
	    	this.displayResolution=displayResolution;
	    	this.price=price;
	    	this.warranty=warranty;
	    	this.discount=discount;
	    }
		@Override
		public String toString() {
			return "Laptop [brand=" + brand + ", displaySize=" + displaySize + ", ram=" + ram + ", storageType="
					+ storageType + ", graphicCard=" + graphicCard + ", displayResolution=" + displayResolution + ", price="
					+ price + ", warranty=" + warranty + ", discount=" + discount + "]";
		}
	    
}
