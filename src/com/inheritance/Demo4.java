package com.inheritance;

class Animal2 {
	public void eat() {
		System.out.println("eating.......");
	}
}

class Dog2 extends Animal2{
	public void bark() {
		System.out.println("barking.......");
	}
}

class Cat extends Animal2 {
	public void meow() {
		System.out.println("mowing");
	}
}

public class Demo4 {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.meow();
		c.eat();
		//c.bark();
	}

}
