package com.static_this_keyword;

public class Demo4 {
	int rollno;
	String name;
	static String college = "ITS";
	
	public static void Change() {
		college="BBDS";
	}
	public Demo4(int r, String n) {
		rollno=r;
		name=n;
	}
	public void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
	public static void main(String[] args) {
		Demo4.Change();
		Demo4 d1 = new Demo4(11, "Ram");
		Demo4 d2 = new Demo4(12, "Amit");
		d1.display();
		d2.display();
	}
	
	

}
