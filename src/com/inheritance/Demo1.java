package com.inheritance;

class D1 {
	int salary =400000;
}
public class Demo1 extends D1{
	int bonous=10000;
	int j=0;
	public static void main(String[] args) {		
		Demo1 d1 = new Demo1();
		System.out.println("Pragrammer salary is "+ d1.salary);
		System.out.println("Programmer bonous is "+d1.bonous);
		System.out.println("Total amount is "+(d1.salary+d1.bonous));
		d1.a();		
	}	
	public void a() {		
		for(int i=1; i<=12; i++){			
			j=400000/12;
			 if(i==10) {
				 j=j+bonous;				 
			 }			 
			 if(i==1) {
				 System.out.println("January salary = : " + j);
			 }
			 if(i==2) {
				 System.out.println("Feb salary = : " +j); 
			 }
			 if(i==10) {
				 System.out.println("Octobar salary and diwali bonus = : " + j);
			 }		 
		}	
	}
}
