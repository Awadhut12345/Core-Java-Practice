package com.onlogic.practice;

public class Demo3 {
	int a =10 ;     // Global variable / Instance variable
	static int s =11;
	
	public void method() {
		String ss = "Awadhut";  // local variable
		System.out.println(ss);
		
	}
	public static void main(String[] args) {
		int data =100;   // instance variable
		
		
		Demo3 d = new Demo3(); 
		d.method();
		
		System.out.println(data);
		System.out.println(d.a);
		System.out.println(d.s);
		
		System.out.println(s);
		
		
	}
	
}
