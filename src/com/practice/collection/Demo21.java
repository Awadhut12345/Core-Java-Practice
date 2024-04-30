package com.practice.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo21 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		Integer i = new Integer(10);
		Character c = new Character('a');
		Double d = new Double(100.0d);
		
		al.add(i);
		al.add(c);
		al.add(d);
		System.out.println(al);
	}

}
