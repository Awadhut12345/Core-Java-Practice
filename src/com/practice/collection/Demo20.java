package com.practice.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo20 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		
		Iterator str = list.iterator();
		
		while(str.hasNext()) {
			System.out.println(str.next());
		}
	
	}
}
