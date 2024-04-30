package com.static_this_keyword;

public class Demo5 {	
	public static int cube(int x) {
		return x*x*x;
	}	
	public static void main(String[] args) {
		int result = Demo5.cube(5);
		System.out.println(result);		
	}
}
