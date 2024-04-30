package com.innterface;

interface Drawable {
	
	public void draw();
}
class Rectangle implements Drawable {
	public void draw() {
		System.out.println("Drawing rectangle");
	}
}
class Circle implements Drawable {

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}	
}

public class Demo2 {

	public static void main(String[] args) {
		Drawable d = new Circle();
		d.draw();
	}
}
