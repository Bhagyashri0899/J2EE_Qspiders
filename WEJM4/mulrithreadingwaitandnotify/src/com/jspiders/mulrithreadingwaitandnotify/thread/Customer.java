package com.jspiders.mulrithreadingwaitandnotify.thread;

import com.jspiders.mulrithreadingwaitandnotify.resources.Shop;

public class Customer extends Thread {
        private Shop shop;
        private int noOfProduct;
		public Customer(Shop shop, int noOfProducts) {
			super();
			this.shop = shop;
			this.noOfProduct = noOfProducts;
		}
        
        @Override
        public void run() {
          shop.purchaseProducts(noOfProduct);
        }
        
}
