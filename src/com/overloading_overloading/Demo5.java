package com.overloading_overloading;

class D5 {
	public void run() {
		System.out.println("Vehicle is running");
	}
}


public class Demo5 extends D5 {
	public void run() {
		System.out.println("Bike is running");
	}
	public static void main(String[] args) {
		Demo5 d1 = new Demo5();
		d1.run();
		
		D5 d = new D5();
		d.run();
		
	}
	
	
}

