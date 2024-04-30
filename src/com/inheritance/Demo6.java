package com.inheritance;
// Aggregation - HAS-A relationsip

class Operation {
	public int square(int n) {
		return n*n;
	}
}
class Circle {
	Operation op;
	double pi=3.14;
	
	public double area(int radius) {
		op=new Operation();
		int rsquare = op.square(radius);
		return pi*rsquare;
	}
}
public class Demo6 {
	public static void main(String[] args) {
		Circle c = new Circle();
		double result = c.area(5);
		System.out.println(result);
	}
}
