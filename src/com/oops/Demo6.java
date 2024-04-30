package com.oops;
class Rectangle {
	int legth;
	int width;
	public void insert(int i, int w) {
		legth=i;
		width=w;		
	}
	public void CalculateArea() {
		System.out.println(legth*width);
		System.out.println(legth+width);
		System.out.println(legth-width);
		System.out.println(legth/width);
	}
}
public class Demo6 {
	public static void main(String[] args) {
		Rectangle r =new Rectangle();
		r.insert(11, 5);
		r.CalculateArea();
	}
}
