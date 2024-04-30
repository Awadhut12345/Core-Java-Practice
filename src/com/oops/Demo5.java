package com.oops;
class Employee {	
	int id;
	String name;
	Long salary;
	
	public void insert(int i, String n, Long s) {
		id= i;
		name=n;
		salary=s;
	}
	public void display() {
		System.out.println(id+" "+name+" "+salary);
	}
}
public class Demo5 {
	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e1 = new Employee();
		e.insert(1, "Amit", 13221l);
		e1.insert(2, "Jonn", 1000l);
		e.display();
		e1.display();
	}
}