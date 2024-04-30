package com.constructor;

public class Demo6 {
	int id;
	String name;
	
	public Demo6(int i, String n) {
		id=i;
		name=n;
	}
	public Demo6() {
		
	}
	public void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		Demo6 d = new Demo6(111, "Karan");
		Demo6 d1 = new Demo6();
		d1.id= d.id;
		d1.name=d.name;
		d.display();
		d1.display();		
	}

}
