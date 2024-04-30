package com.overloading_overloading;

class D4 {
	public void run() {
		System.out.println("Vehicle is running");
	}
}


public class Demo4 extends D4 {
	public static void main(String[] args) {
		Demo4 d1 = new Demo4();
		d1.run();
	}
	
	
}
