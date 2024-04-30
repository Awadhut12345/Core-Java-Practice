package com.constructor;

public class Demo3 {
	int id;
	String name;
	public Demo3(int i, String n) {
		id=i;
		name=n;
	}
	public void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		Demo3 d = new Demo3(111, "Karan");
		Demo3 d1 = new Demo3(222, "Aryan");
		d.display();
		d1.display();		
	}
}


