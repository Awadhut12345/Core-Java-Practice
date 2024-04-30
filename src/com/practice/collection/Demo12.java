package com.practice.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Demo12 {
	  public static void main(String args[]) {   
	        Set<Integer> data = new LinkedHashSet<Integer>();
	        data.add(31);   
	        data.add(21);   
	        data.add(41);  
	        data.add(91);   
	        data.add(71);   
	        data.add(81);         
	        System.out.println("data: " + data);  
	          
	        ArrayList<Integer> newData = new ArrayList<Integer>();   
	        newData.add(91);   
	        newData.add(71);   
	        newData.add(81);  
	        System.out.println("newData: " + newData);  
	          
	        data.retainAll(newData);      
	        System.out.println("data after retaining newdata elements : " + data);        
	    }   

}

class Demo13 {
	 public static void main(String[] args) {
	        List<String> list1 = new ArrayList<>();
	        list1.add("apple");
	        list1.add("orange");
	        list1.add("banana");

	        List<String> list2 = new ArrayList<>();
	        list2.add("orange");
	        list2.add("grape");
	        list2.add("kiwi");
	        list2.add("apple");

	        // Retain only the common elements between list1 and list2
	        boolean result = list1.retainAll(list2);

	        System.out.println("List1 after retaining common elements: " + list1);
	        System.out.println("Was the list modified? " + result);
	    }
}
