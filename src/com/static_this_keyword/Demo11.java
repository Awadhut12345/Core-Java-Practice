package com.static_this_keyword;
class D3 {
	public D3() {
		System.out.println("hello d3");
	}
	public D3(int x) {
		this();
		System.out.println(x);
	}
}
public class Demo11 {
	public static void main(String[] args) {
		D3 d1 = new D3(4);
		
	}
}
