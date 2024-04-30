package com.string;

public class Demo4 {

	public static void main(String[] args) {
		String s1 = "Sachin";
		String s2 = "SACHIN";
		System.out.println(s1.equals(s2)); // False
		System.out.println(s1.equalsIgnoreCase(s2)); //true
	}
}
