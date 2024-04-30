package com.java.projects;

import java.util.ArrayList;
import java.util.Scanner;

class E1 {
	private String name;
	private int age;
	private double salary;
	private String department; 
	private String address;
	
	public E1(String name, int age, double salary, String department, String address) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.department=department;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	public String getDepartment() {
		return department;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "E1 =  Name : "+ name +", Age : "+ age + " , Salary : "+salary + " , Department " + department + ", Address : "+address + "   " ;
	}
}


public class EmpTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<E1> e1 = new ArrayList<>();
		for(int i=0; i<1; i++) {
			System.out.println("Enter employee details " + (i+1));
			System.out.println("Name : ");
			String name = sc.next();
			
			System.out.println("Age :");
			int age = sc.nextInt();
		
			System.out.println("Salary : ");
			double salary = sc.nextDouble();
			
			System.out.println("Department : ");
			String department = sc.next();
			
			System.out.println("Address : ");
			String address = sc.next();
			
			e1.add(new E1 (name, age, salary, department,address));		
		}
		System.out.println("\nEmployee List: ");
		
		for(E1 ee : e1) {
			System.out.println(ee);
		}
		sc.close();
		
		
	}
	

}
