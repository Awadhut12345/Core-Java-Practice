package com.static_this_keyword;

public class Demo14 {
	int data =10;
	
	public Demo14() {
		D5 d1 = new D5(this);
		d1.display();
		
	}
	public static void main(String[] args) {
		Demo14 d2 = new Demo14();
	}
}
class D5 {
	Demo14 obj;
	public D5(Demo14 obj) {
		this.obj=obj;
	}
	public void display() {
		System.out.println(obj.data);
	}
	
}
