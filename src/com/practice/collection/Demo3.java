package com.practice.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo3 {
    public static void main(String args[]) {   
        Set<Integer> data = new LinkedHashSet<Integer>();   
        data.add(31);   
        data.add(21);   
        data.add(41);   
        System.out.println("Set: " + data);  
        
        ArrayList<Integer> newData = new ArrayList<Integer>();   
        newData.add(91);   
        newData.add(71);   
        newData.add(81);  
        data.addAll(newData);   
        System.out.println("Set: " + data);   
      
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(101);
        array.add(102);
        array.add(103);
        array.add(104);
        System.out.println(array);
       // System.out.println(array+""+data+""+newData+"   ");
        
        
        array.addAll(data);
        System.out.println(array);
        
        
        
        
    }   
}
