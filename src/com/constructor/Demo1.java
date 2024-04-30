package com.constructor;

public class Demo1 {
	public Demo1() {
		System.out.println("Demo1 is created");
	}
	public static void main(String[] args) {
		Demo1 d  = new Demo1();
	}
	

}


class Co {
	public Co() {
		System.out.println("Constructor");
	}
	public Co(int a) {
		System.out.println("parameterized constructor");
	}
	
	public static void main(String[] args) {
		Co c = new Co();
		Co c1 = new Co(10);
	}
}