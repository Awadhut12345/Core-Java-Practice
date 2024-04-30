package com.constructor;
public class Demo5 {
	int id;
	String name;
	
	public Demo5(int i, String n) {
		id=i;
		name=n;
	}
	public Demo5(Demo5 s) {
		id=s.id;
		name=s.name;
	}
	public void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		Demo5 d = new Demo5(111, "Karan");
		Demo5 d1 = new Demo5(d);
		d.display();
		d1.display();		
	}
}
