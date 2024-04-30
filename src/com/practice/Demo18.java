package com.practice;


public class Demo18 implements Cloneable {
	public static void main(String[] args) {
		int num =4;             // 0,1,2,3,4
		
		switch(num) {
		case 0 :
			System.out.println("Number is 0"); 
			break;
		case 1 :
			System.out.println("Number is 1");
			break;
		
		default :
			System.out.println(num);
		}
	}
}
// O/p -
// 2

//0,1,2,3
// Number is 0
// Number is 1
// 2
// 3
// 4