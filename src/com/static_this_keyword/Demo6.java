package com.static_this_keyword;

public class Demo6 {

	static int a =40;
	int b =10;
	
	public static void main(String[] args) {
		System.out.println(a);
		//System.out.println(b);             // compile time error
	}
}
