package com.static_this_keyword;

public class Demo13 {

	public void m(Demo13 obj) {
		System.out.println("Method is invoked");
	}
	public void p() {
		m(this);
	}
	public static void main(String[] args) {
		Demo13 d1 = new Demo13();
		d1.p();
	}
}
