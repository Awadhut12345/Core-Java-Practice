package com.static_this_keyword;

public class Demo3 {
	static int count=0;
	
	public Demo3() {
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		Demo3 d1 = new Demo3();
		Demo3 d2 = new Demo3();
		Demo3 d3 = new Demo3();
	}
}
