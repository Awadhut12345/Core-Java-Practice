package com.java.projects;

import java.util.Scanner;

// Gender - Male Female
// Age 
// Male - 20-40 work any were
// Female -    


public class Work {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter gender here (male/female) : " );
		
	    	String gender = sc.nextLine().toLowerCase();
	    	
	    	System.out.println("Enter age here : ");
	    	int age = sc.nextInt();	
	    	
	    	if(gender.equals("male") && age >= 20 && age <=40)  {
	    		System.out.println("This person work anywere");
	    	} else if(gender.equals("male") &&  age >=40 && age<=60)  {
	    		System.out.println("This person is working in urbon area");
	    	} else if(gender.equals("female")) {
	    		System.out.println("Female working any were");
	    	} else {
	    		System.out.println("This person is not work anywere");
	    	}		
	}
}
class Work1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter gender here (male/female) : ");
		
		String gender = sc.nextLine().toLowerCase();
		System.out.println("Enter age here ");
		int age = sc.nextInt();
		
		if (gender.equals("female")) {
			System.out.println("Female working any were");
		}		
		else if(gender.equals("male")) {
			if(age>=20 && age<=40) {
				System.out.println("This person work anywere");
			} else if(age>=40 && age<=60) {
		 		System.out.println("This person is working in urbon area");
			} else {
	    		System.out.println("This person is not work anywere");
	    	} 
		} else {
    		System.out.println("This person is Invalid");
    	}  
		 
	}
	
}