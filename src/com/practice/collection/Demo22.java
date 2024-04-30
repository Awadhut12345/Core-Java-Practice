package com.practice.collection;

import java.util.ArrayList;

public class Demo22 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add('a');
		al.add(10.5);
		System.out.println(al);
	}
}

// Autoboxing
class Demo23 {
	Demo23() {
		
	}
	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		arraylist.add(Integer.valueOf(10));
		arraylist.add(Character.valueOf('a'));
		arraylist.add(Double.valueOf(10.4));
		System.out.println(arraylist);
	}
}