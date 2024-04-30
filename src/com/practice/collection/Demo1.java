package com.practice.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo1 {
	 public static void main(String[] args)  {   
	        Set<String> data = new LinkedHashSet<>(); 
	        Set<String> data1 = new LinkedHashSet<>();
	        data1.add("Java");
	        data1.add("Python");
	        data1.add("JavaScript");
	        data1.add("MsSql");
	    
	        data.add("JavaTpoint");   
	        data.add("Set");   
	        data.add("Example");   
	        data.add("Set");   
	        
	        System.out.println(data1+ " , ");
	        System.out.println(data);   
	    }   

}
