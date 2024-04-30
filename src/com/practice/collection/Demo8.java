package com.practice.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo8 {
	  public static void main(String args[]) {   
	        Set<Integer> data = new LinkedHashSet<Integer>();   
	        data.add(31);   
	        data.add(21);   
	        data.add(41);   
	        data.add(51);   
	        data.add(11);   
	        data.add(81);   
	        System.out.println("data: " + data);  
	       System.out.println("\nIs data empty?: "+ data.isEmpty());   
	       
	       Set<Integer> data1 = new LinkedHashSet<>();
	       
	       System.out.println("\nIs data1 empty : "+data1.isEmpty());
	     
	    }   
}
