package com.static_this_keyword;

class D2 {
	public void m() {
		System.out.println("Hello M");
	}
	public void n() {
		System.out.println("Hello n");
		this.m();
	}
}


public class Demo10 {
	public static void main(String[] args) {
		D2 d1 = new D2();
		d1.n();
	}

}
