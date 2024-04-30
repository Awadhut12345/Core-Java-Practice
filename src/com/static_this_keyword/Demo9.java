package com.static_this_keyword;

public class Demo9 {
	public static void main(String[] args) {
		D10 d1 = new D10(11, "Ram", 8888f);
		D10 d2 = new D10(12, "Amit", 7778f);
		d1.display();
		d2.display();
	}
}


class D10{
	
	int rollno;
	String name;
	float fee;
	
	public D10(int r, String n, float f) {
		this.rollno=r;
		this.name =n;
		this.fee =f;
	}
	public void display() {
		System.out.println(rollno+" "+ name+" "+ fee);
	}
	
	
}
	
	

