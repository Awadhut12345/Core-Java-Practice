package com.oops;
class Rectangle1 {
	int length;
	int width;
	
	public void insert(int l, int w) {
		length =l;
		width=w;
	}
	public void CalculateArea() {
		System.out.println(length*width);
	}
}
public class Demo8 {
	public static void main(String[] args) {
		Rectangle1 r = new Rectangle1(), r1=new Rectangle1();
		r.insert(11, 5);
		r1.insert(12, 5);
		r.CalculateArea();
		r1.CalculateArea();
	}

}
