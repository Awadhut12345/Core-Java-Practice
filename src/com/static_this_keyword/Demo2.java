package com.static_this_keyword;

public class Demo2 {
	int count=0;
	public Demo2() {
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		Demo2 d1 = new Demo2();
		Demo2 d2 = new Demo2();
	}	
	 	
}
