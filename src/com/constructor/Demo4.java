package com.constructor;

public class Demo4 {
	int id;
	String name;
	int age;
	
	public Demo4(int i , String n) {
		id=i;
		name=n;
	}
	public Demo4(int i, String n, int a) {
		id=i;
		name=n;
		age=a;
	}
	public void display() {
		System.out.println(id+" "+name+" "+ age);
	}
	public static void main(String[] args) {
		Demo4 d = new Demo4(111, "Karan");
		Demo4 d1 = new Demo4(222, "Aryan", 24);
		d.display();
		d1.display();
	}
	

}
