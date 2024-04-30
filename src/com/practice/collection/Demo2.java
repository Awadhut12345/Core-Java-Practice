package com.practice.collection;


import java.util.LinkedHashSet;
import java.util.Set;

public class Demo2 {
	public static void main(String args[])   
    {   
        Set<Integer> data = new LinkedHashSet<Integer>();   
        data.add(31);   
        data.add(21);   
        data.add(41);   
        data.add(11);   
        data.add(61);   
        data.add(51);   
        System.out.println("data: " + data);   
        
        Set<Integer> data1 = new LinkedHashSet<Integer>();
        data1.add(100);
        data1.add(101);
        data1.add(102);
        data1.add(103);
        System.out.println("data1: " + data1);
    }   

}
