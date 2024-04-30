package com.practice1;

// Singleton class
public class Demo3 {

	private static Demo3 singleton;
	
	private Demo3() {
		
	}
	
	public static Demo3 getInstance() {
	
		if(singleton==null) {
			singleton =new Demo3();
		}
		return singleton;
	}
	
}


class Singleton {
	private static Singleton singleton;
	
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(singleton==null) {
			singleton= new Singleton();
		}
		return singleton;
	}
}















