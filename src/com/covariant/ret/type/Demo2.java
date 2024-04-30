package com.covariant.ret.type;

class A {
   public A get() {
	   return this;
   }
}


public class Demo2 extends A {

	@Override
	public Demo2 get() {
		return this;
	}
	public void message() {
		System.out.println("Welcome  to covariant return type");
	}
	public static void main(String[] args) {
		new Demo2().get().message();
		
	}
	
 }
