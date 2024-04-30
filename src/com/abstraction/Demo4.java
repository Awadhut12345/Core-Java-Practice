package com.abstraction;

abstract class B1 {
	public B1() {
		System.out.println("Bike is created");
	}
	abstract void run();
	
	public void changeGear() {
		System.out.println("gear changed");
	}
}
class Honda extends B1 {

	@Override
	void run() {
		System.out.println("running safely");
	}
	
}
public class Demo4 {
	public static void main(String[] args) {
		B1 b = new Honda();   // Bike is created
		b.run();              // running safely
		b.changeGear();       // gear changed
	}
}
