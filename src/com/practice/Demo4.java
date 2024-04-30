package com.practice;

public class Demo4 {	
	public static void main(String[] args) {		
		Class c = Demo4.class;
		System.out.println(c.getClassLoader());
		System.out.println(String.class.getClassLoader());
	}
}
 

// O/P-
// jdk.internal.loader.ClassLoaders$AppClassLoader@7006c658
// null