package com.practice.collection;

import java.util.ArrayList;

public class Demo19 {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana"); 
		fruits.add("Orange");
		System.out.println(fruits);
		
		for(String fruit : fruits) {
			System.out.println(fruit);
		}		
	}
}
