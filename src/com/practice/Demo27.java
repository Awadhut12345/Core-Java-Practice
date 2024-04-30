package com.practice;

public class Demo27 {
	public static void main(String[] args) {
		for(int i=0; i<=2; i++) {
			for(int j=i; j<=5; j++) {
				if(j==3) {
					continue;
				}
				System.out.print(j+" ");
			}
		}		
	}
}

//	O/p - 
//	0
//	1
//	2
//	3
//	5
//	1
//	2
//	3
//	5
//	2
//	3
//	5