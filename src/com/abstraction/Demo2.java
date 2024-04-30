package com.abstraction;

abstract class Shape {
	abstract void draw();
}
class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("drawing rectagle ");
	}	
}
class Circle extends Shape {
	@Override
	void draw() {		
		System.out.println("drawing Circle");
	}	
}
public class Demo2 {
	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
	}

	
}
