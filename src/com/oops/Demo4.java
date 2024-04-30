package com.oops;

class D3 {
	int rollno;
	String name;
	
	public void insertRecord(int i, String n) {
		rollno =i;
		name =n;
		
	}
	public void DisplayInformation() {
		System.out.println(rollno+" "+name);
	}
}

public class Demo4 {
	public static void main(String args[]) {
	D3 d = new D3();
	D3 d1 = new D3();
	
	d.insertRecord(111, "Amol");
	d1.insertRecord(112, "Ram");
	
	d.DisplayInformation();
	d1.DisplayInformation();
	}
}
