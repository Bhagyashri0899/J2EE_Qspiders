package com.jspiders.mulrithreadingwaitandnotify.resources;

public class Shop {
       int noOfProducts;

	public Shop(int noOfProducts) {
		super();
		this.noOfProducts = noOfProducts;
	}
       public synchronized void restockProduct(int restockProducts) {
    	   noOfProducts+=restockProducts;
    	   System.out.println(restockProducts + "Successfully added to the stock");
    	   
    	   System.out.println("now available Products:" + noOfProducts);
    	   this.notify();
       }
       
    	   public synchronized  void purchaseProducts(int purchaseProducts){
    		   if (noOfProducts<purchaseProducts) {
				System.out.println(purchaseProducts+"product not available please wait");
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
    		   
               noOfProducts-=purchaseProducts;
    		   System.out.println(purchaseProducts+"successfully    parchased");
    		   System.out.println("now available products:" + noOfProducts);
    	   }
       }
       
       
       
 

