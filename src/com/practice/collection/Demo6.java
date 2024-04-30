package com.practice.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo6 {
	 public static void main(String args[]) {   
	        Set<Integer> data = new LinkedHashSet<Integer>();   
	        data.add(31);   
	        data.add(21);   
	        data.add(41);   
	        data.add(51);   
	        data.add(11);   
	        data.add(81);   
	  
	        System.out.println("data: " + data);  
	          
	        Set<Integer> newData = new LinkedHashSet<Integer>();   
	        newData.add(31);   
	        newData.add(21);   
	        newData.add(41);   
	          
	       System.out.println("\nDoes data contains newData?: "+ data.containsAll(newData));  
	       
	       Set<Integer> data1 = new LinkedHashSet<Integer>();
	       data1.add(81);
	       data1.add(11);
	       data1.add(51);
	       data1.add(31);   
	       data1.add(21);   
	       data1.add(41);
	       System.out.println(data1.containsAll(data));      
	    }   
}
