package com.constructor;

public class Demo2 {

	int id;
	String name;
	public void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		Demo2 d1 = new Demo2();
		d.display();
		d1.display();
	}
}


