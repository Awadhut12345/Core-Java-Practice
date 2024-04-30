package com.overloading_overloading;

public class Demo1 {
	public static int add(int a, int b) {
		return a+b;
	}
	public static int add(int a, int b, int c) {
		return a+b+c;
	}	
//	public static double add(int a, int b) {
//		return a+b;
//	}
	public static void main(String[] args) {
		System.out.println(Demo1.add(11,11));
		System.out.println(Demo1.add(11, 11, 11));
	}	
}
