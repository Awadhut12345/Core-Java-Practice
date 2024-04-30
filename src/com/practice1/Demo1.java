package com.practice1;

//Copy - Constructor
public class Demo1 {
	int id;
	String name;
	
	public Demo1(int i, String n) {
		this.id=i;
		this.name=n;
	}
	public Demo1(Demo1 d) {
		this.id=d.id;
		this.name=d.name;
	}
	public void Display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		Demo1 d1 = new Demo1(101, "Abc");
		Demo1 d2 = new Demo1(d1);
		d1.Display();
		d2.Display();
	}
 
}
