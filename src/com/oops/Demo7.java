package com.oops;

// Factorial Number
public class Demo7 {
	public void fact(int n) {
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact=fact*i;         
		}
		System.out.println("Factorial is : "+fact);   // 1*2*3*4*5= 120	
	}
	public static void main(String[] args) {
		new Demo7().fact(5);
	}
}

//Output- Factorial is : 120  
