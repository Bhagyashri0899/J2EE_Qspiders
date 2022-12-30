package com.jspides.multihreadingsleep.main;

public class ThreadMain {
     public static void main(String[] args) {
	     String str="Welcome to WEJM4";
	     char[] charArray = str.toCharArray();
	     
	     for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);	
	     }
			try {
				Thread.currentThread().sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		  
	     
   }
}
