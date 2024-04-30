package com.practice;

public class Demo21 {
	public static void main(String[] args) {
		String[] names = {"Java", "C", "C++", "Python", "JavaScript"};
		System.out.println("Printing the content of array names\n");
		
		for(String name : names) {
			System.out.println(name);
		}
	}
}
// O/p -
// Printing the content of array names

// Java
// C
// C++
// Python
// JavaScript


class Demo22 {
	public static void main(String[] args) {
		int[] number = {1,2,3,4,5};
		System.out.println("Printing the content of array num\n");
		
		for(int num : number) {
			System.out.println(num);
		}
	}
}

// O/p - 
// Printing the content of array num

// 1
// 2
// 3
// 4
// 5