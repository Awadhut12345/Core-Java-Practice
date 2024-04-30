package com.practice1;

// Method Overloading
public class Demo2 {

	public void m1() {
		System.out.println("Method overloading - 1");
	}
	public void m1(int i) {
		System.out.println("Method overloading - 2");
	}
	public void m1(String s) {
		System.out.println("Method overloading - 3");
	}
	public void m1(float f) {
		System.out.println("Method overloading - 4");
	}
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.m1();
		d.m1(10);
		d.m1("ABC");
		d.m1(20.0f);
	}
}
