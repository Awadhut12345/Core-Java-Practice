package com.java.projects;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Investment_Project {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your buying price per share : ");
		double buyingPrice = sc.nextDouble();
		int day = 1;
		
		double closingPrice = 0.1;
//		DecimalFormat df = new DecimalFormat("0.00");
		while(true) {
			System.out.println("Enter the closing price for day " 
					+ day + " (any negative value to leave: )") ;
			 closingPrice = sc.nextDouble();
			 if(closingPrice < 0.0) {
				 break;
			 }
			 double earning = closingPrice - buyingPrice;
			 if(earning > 0.0) {
				 System.out.println("After day " + day + ", you earned "
						 + earning + " per share.");
			 }
			 else if(earning < 0.0) {
				 System.out.println("After day " + day + ", you lost "
						 + (-earning) + " per share.");
			 }
			 else {
				 System.out.println("After day " + day + ", you have "
						 + "no earnings per share.");
			 }
			 day += 1;
		}		
	}
}
