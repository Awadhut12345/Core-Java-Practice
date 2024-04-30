package com.practice;

public class Demo13 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(a+b); //30
		System.out.println(a-b); //-10
		System.out.println(a*b); //200
		System.out.println(b/a); //2
		System.out.println(a/b); //0
				
		System.out.println(10*10/5+3-1*4/2); //21   10*2+3-1*2 // 20+3-2 // 20+1 // 21
		
		System.out.println(10<<2); // 10*2^2=10*4=40      // 2*2  =4
		System.out.println(10<<3); // 10*2^3=10*8=80      // 2*2*2=8
		System.out.println(10<<6); // 10*2^6=10*64=640    // 2*2*2*2*2*2=64
		System.out.println(15<<4); // 15*2^4=15*16=240    // 2*2*2*2=16
		
		System.out.println(10>>2); // 10/2^2= 10/4 =2
		System.out.println(10>>4); // 10/2^4= 10/16=0	
	}
}
// O/p -
// 30
// -10
// 200
// 2
// 0
// 21
// 40
// 80
// 640
// 240
// 2
// 0
