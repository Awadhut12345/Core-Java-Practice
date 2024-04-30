package com.onlogic.practice;

class Student{
	 int id;
	 String name;
	
	 public Student() {
		 this.id=11;
		 this.name="aaa";
	 }
	 

}


public class Demo2 {
	private int id;
	private String name;
	private long mobileno;
	private boolean status;
    Student student;
	
	public Demo2() {
		this.id=10;
		this.name="Awadhut";
		this.mobileno=9876767676l;
		this.status = false;		
		this.student=student;
	}
	public void display() {
		System.out.println(id+" "+name);
		System.out.println(id+" "+name+" "+mobileno);
		System.out.println(mobileno);
		
		System.out.println(id+ " = " +name);
		//System.out.println();

		System.out.println(id+" "+name+" "+mobileno+" "+ " "+ status+" "+ student);
		
	}
	
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.display();
		
		Student s = new Student();
		//s.display1();
	}

}
