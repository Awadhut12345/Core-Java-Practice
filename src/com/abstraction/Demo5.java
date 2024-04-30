package com.abstraction;

interface D1 {
	public void a();
	public void b();
	public void c();
	public void d();
}

abstract class B implements D1 {
	public void c() {
		System.out.println("I am c..");
	}
}
class M extends B {
	public void a() {
		System.out.println("I am a..");
	}
	@Override
	public void b() {
		System.out.println("I am b..");
	}

	@Override
	public void d() {
		System.out.println("I am d..");
	}
}
public class Demo5 {
	public static void main(String[] args) {
		D1 d = new M();
		d.a();
		d.b();
		d.c();
		d.d();
	}
}
