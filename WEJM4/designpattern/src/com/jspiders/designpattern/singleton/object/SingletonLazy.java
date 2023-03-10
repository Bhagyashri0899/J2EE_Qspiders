package com.jspiders.designpattern.singleton.object;

public class SingletonLazy {
	static SingletonLazy object;
	static int count;
	
	private SingletonLazy() {
		count++;
		
	}
	public static SingletonLazy getObject() {
		if (object==null) {
			object=new SingletonLazy();
			
		}
		System.out.println("object created "+ count + " times");
		return object;
		
	}

}
