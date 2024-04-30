package com.practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Collection - sort and reverse

public class Demo4 {
	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("Awadhut");
		items.add("Bablu");
		items.add("10");
		items.add("20");
		
		Collections.addAll(items, "Fruits","Bat","Ball","Nilesh", "Amol");
		
		for(int i=0; i<items.size(); i++) {
			System.out.print(items.get(i)+ " ");
			
		}
		System.out.println();
		 
		Collections.sort(items, Collections.reverseOrder());
		for(int i=0; i<items.size(); i++) {
			System.out.print(items.get(i) + " ");
		}
		
	}
}
