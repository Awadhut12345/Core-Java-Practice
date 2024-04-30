package com.practice;

public class Demo {	
	private int id;
	private String name;
	
	public Demo() {
		this.id = 100;
		this.name = "Awadhut";
		
		System.out.println("Student id = "+ id );
		System.out.println("Student name = "+ name);
	}
	public static void main(String[] args) {
		System.out.println("Welcome Awadhut");
		Demo d = new Demo();			
	}
}
// O/p - 
// Welcome Awadhut
// Student id = 100
// Student name = Awadhut