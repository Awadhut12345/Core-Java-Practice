package com.onlogic.practice;

public class Demo4 {
	int a=10;
	int b=20;
	
	int c =a+b;
	int d=a-b;
	int e=a*b;
	int f=a/b;
	
	public void method() {
		int aa =100;
		int bb =20;
		
		int cc=aa+bb;
		int dd=aa-bb;
		System.out.println(cc);
		System.out.println(dd);
	}
	
	
	public static void main(String[] args) {
		Demo4 d = new Demo4();
		System.out.println(d.c);
		System.out.println(d.d);
		System.out.println(d.e);
		System.out.println(d.f);
		System.out.println("------------");
		
		d.method();
		
	}

}
