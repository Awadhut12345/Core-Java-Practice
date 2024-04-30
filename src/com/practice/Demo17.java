package com.practice;

public class Demo17 {
	public static void main(String[] args) {
		String address = "Delhi,India";
		
		if(address.endsWith("India")) {
			if(address.endsWith("Delh")) {
				System.out.println("Your city is Meeruth");
			} else if(address.contains("Noida")) {
				System.out.println("Your city is Noida");
			} else {
				System.out.println(address.split(",")[0]);
			} 
		    } else {
				System.out.println("You are not living in India");
			}		
	}
}
// O/p -
// Delhi

