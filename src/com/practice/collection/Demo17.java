package com.practice.collection;
import java.util.Scanner;

public class Demo17 {
	public static void main(String[] args) {		
		int z;
		System.out.println("Enter Number");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		z=n+m;
		System.out.println("Addition of two number = " + z);
	}

}
class Demo18 {
	public static void main(String[] args) {
		String a;
		System.out.println("Enter number");
		
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String m = sc.next();
		String k = sc.next();
		a = n+m+k;
		System.out.println(a);
		
	}
}
