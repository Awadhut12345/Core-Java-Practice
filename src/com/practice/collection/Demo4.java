package com.practice.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo4 {
	 public static void main(String args[])  {   
	        Set<Integer> data = new LinkedHashSet<Integer>();   	    
	        data.add(31);   
	        data.add(21);   
	        data.add(41);   
	        System.out.println("Set: " + data);  
	          
	        data.clear();   
	        System.out.println("The final set: " + data);   
	        
	        data.add(101);
	        data.add(102);
	        System.out.println(data);
	        
	        data.clear();
	        System.out.println(data);
	    }   
	
}
