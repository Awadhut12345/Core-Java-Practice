package com.java.projects;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee_e {
	private String name;
	private int totalWorkingDays;
	private int presentDays;
	private int leaveDays;
	
	
	public Employee_e(String name, int totalWorkingDays, int presentDays, int leaveDays ) {
		this.name=name;
		this.totalWorkingDays=0;
		this.presentDays=0;
		this.leaveDays=0;
		
	}
	
	public void markAttendence(boolean isPresent) {
		totalWorkingDays++;
		if(isPresent) {
			presentDays++;
		} else {
			leaveDays++;
		}
	}
	
	public double calculateAttendancePercentage() {
		if(totalWorkingDays == 0) {
			return 0.0;
		}
		return (double)  presentDays / totalWorkingDays * 100; 
	}	
	
	public String getName() {
		return name;
	}
	public int getTotalWorkingDays() {
		return totalWorkingDays;
	}
	public int getPresentDays() {
		return presentDays;
	}
	public int getLeaveDays() {
		return leaveDays;
	}
	
//	@Override
//	public String toString() {
//		return " Employee name = "+name + " , totalWorkingDays=" + totalWorkingDays +
//				", presentDays= "+ presentDays + ", leaveDays = " + leaveDays + " " ;
//	}
	
	
	
}


public class EmployeeAttendenceSheet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, Employee_e> employees = new HashMap<>();
		
		while(true) {
			System.out.println("\n1. Mark Attendence");
			System.out.println("2. Generate Attendence Report");
			System.out.println("3. Exit");
			System.out.println("Enter your choice : ");
			int choise = scanner.nextInt();
			scanner.nextLine();
			
			
			
		}
		
		
		
		
		
	}
	
	
}
