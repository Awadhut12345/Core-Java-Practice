package com.static_this_keyword;

class D4  {
 int rollno;
 String name;
 String course;
 float fee;
 
 public D4(int rollno, String name, String course) {
	 this.rollno = rollno;
	 this.name= name;
	 this.course=course;
 }
 public D4 (int rollno, String name, String course, float fee) {	
	 this(rollno,name,course);
	 this.fee=fee;
 }
 public void display() {
	 System.out.println(rollno+" " + name+" " + course+" " + fee);
 }
}

public class Demo12 {
	public static void main(String[] args) {
		D4 d1 = new D4(11,"Ram", "Java");
		D4 d2 = new D4(12,"Amit", "Javaaaa", 3333);
		d1.display();
		d2.display();
	}

}
