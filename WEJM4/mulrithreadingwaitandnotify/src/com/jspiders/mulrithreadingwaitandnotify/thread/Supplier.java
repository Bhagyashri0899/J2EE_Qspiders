package com.jspiders.mulrithreadingwaitandnotify.thread;

import com.jspiders.mulrithreadingwaitandnotify.resources.Shop;

public class Supplier {
	   private Shop shop;
       private int noOfProducts;
		public Supplier(Shop shop, int noOfProduct) {
			super();
			this.shop = shop;
			this.noOfProducts = noOfProduct;
		}
       
	
       public void run() {
         shop.restockProduct(noOfProducts);
       }
}
