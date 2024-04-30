package com.innterface;

interface Bank {
	float rateOfInterest();
}
class SBI implements Bank {
	@Override
	public float rateOfInterest() {
		return 9.15f;
	}	
}
class PNB implements Bank {
	@Override
	public float rateOfInterest() {
		return 9.7f;
	}
	
}
public class Demo3 {
	public static void main(String[] args) {
		Bank b = new SBI();
		System.out.println("ROI : " +b.rateOfInterest());
		
		Bank b1 = new PNB();
		System.out.println("ROI : " +b1.rateOfInterest());
		
	}
}
