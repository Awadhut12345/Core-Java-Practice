package com.static_this_keyword;

class D6 {
	public D6 getA() {
		return this;
	}
	public void msg() {
		System.out.println("Hello java");
	}
}


public class Demo15 {
	public static void main(String[] args) {
		new D6().getA().msg();
	}

}
