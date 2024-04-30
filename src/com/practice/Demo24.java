package com.practice;

public class Demo24 {
	public static void main(String[] args) {
		int i=0;
		System.out.println("Printing the list of first 10 even numbers\n");
		
		do {
			System.out.println(i);
			i = i+2;
		} while(i<=10);
	}
}
// O/p -
//	Printing the list of first 10 even numbers
//	
//	0
//	2
//	4
//	6
//	8
//	10