package com.oops;

class D2 {
	int id;
	String name;
}
public class Demo3 {
	public static void main(String[] args) {
		D2 d = new D2();
		D2 d1 = new D2();
		
		d.id=101;
		d.name="Jon";
		
		d1.id=102;
		d1.name="Amit";
		
		System.out.println(d.id+" "+d.name);
		System.out.println(d1.id+" "+d1.name);
	}
}
