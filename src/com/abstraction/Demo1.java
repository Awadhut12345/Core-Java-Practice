package com.abstraction;

abstract class Bike {
	public abstract void run();
}
public class Demo1 extends  Bike {
	@Override
	public void run() {
		System.out.println("running safely");		
	}
	public static void main(String[] args) {
		Bike b = new Demo1();
		b.run();
	}
}
