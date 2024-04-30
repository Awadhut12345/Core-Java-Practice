package com.inheritance;

public class Demo5 extends A   //,B 
{ 
	public static void main(String args[]) {
		Demo5 obj = new Demo5();
		obj.msg();                     // Now which msg() method would be invoked?
	}
}
class A {
	void msg() {
		System.out.println("Hello");
	}
}
class B {
	void msg() {
		System.out.println("Welcome");
	}
}


