package com.static_this_keyword;
class D1 {
	int rollno;
	String name;
	static String college = "ITS";

	
	public D1(int r, String n) {
		rollno=r;
		name=n;
	}
	public void display() {
		System.out.println(rollno+ " "+name+" "+college);
	}
}

public class Demo1 {	
	public static void main(String[] args) {
		D1 d1 = new D1(111, "Karan");
		D1 d2 = new D1(222, "Aryan");
		D1.college="BBDIT";
		d1.display();
		d2.display();		
	}
}
