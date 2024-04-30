package com.practice;

public class Demo15 {
	public static void main(String[] args) {
		int x=10;
		int b=10;
		
		if(x+b > 20) {
			System.out.println("x+y is greater then 20"); //  
		} else if(x+b < 20) {
			System.out.println("x+y is less then 20"); //   
		} else {
			System.out.println("x+y is equal to 20"); //   true
		}		
	}
}
// O/p -
// x+y is equal to 20


class Demo16 {
	public static void main(String[] args) {
		String city="Delhi, India";
		
		if(city=="Pune") {
			System.out.println("city is pune");
		} if(city=="Pune") {
			System.out.println("city is mumbai");
		} if(city=="Pune") {
			System.out.println("city is agra");
		} if(city.startsWith("Delhi")) {
			System.out.println("city is Delhi");
		} else if(city=="Del") {
			System.out.println("city is delh");
		} if(city.endsWith("India")) {
			System.out.println("city is delhi");
		}			
	}
}
// O/p -
// city is delhi

