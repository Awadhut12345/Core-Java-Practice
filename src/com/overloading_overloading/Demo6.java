package com.overloading_overloading;

class D6 {
	public void run() {
		System.out.println("Vehicle is running");
	} 
}


public class Demo6 extends D6{
	public void run() {
		System.out.println("Bike is running safely");
	}
	
	
	public static void main(String[] args) {
		Demo6 d = new Demo6();
		d.run();
	}
}

