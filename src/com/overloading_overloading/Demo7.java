package com.overloading_overloading;

class D7 {
	public int getRateOfinterest() {
		return 0;		
	}
}

class D8 extends D7{
	public int getRateOfinterest() {
		return 8;		
	}
}
class D9 extends D8 {
	public int getRateOfinterest() {
		return 10;
	}
}
class D10 extends D9 {
	public int getRateOfinterest() {
		return 9;
	}
}
public class Demo7 {
	public static void main(String[] args) {
		D8 d1 = new D8();
		D9 d2 = new D9();
		D10 d3 = new D10();
		System.out.println("D8 Rate of interest:  "+d1.getRateOfinterest());
		System.out.println("D9 Rate of interest:  "+d2.getRateOfinterest());
		System.out.println("D10 Rate of interest: "+d3.getRateOfinterest());		
	}
}
