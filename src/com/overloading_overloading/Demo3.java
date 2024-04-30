package com.overloading_overloading;

public class Demo3 {
	
	 void sum(int a,long b) {
		 System.out.println("a method invoked");
		 }  
	  void sum(long a,int b) {
		  System.out.println("b method invoked");
		  }  
	  
	  public static void main(String args[]){  
		  Demo3 obj=new Demo3();  
//	      obj.sum(20,20);                    //now ambiguity  
	  }  

}
