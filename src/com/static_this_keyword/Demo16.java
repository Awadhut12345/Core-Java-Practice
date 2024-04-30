package com.static_this_keyword;

public class Demo16 {

	void m(){  
		System.out.println(this);                   //prints same reference ID  
		}  
		public static void main(String args[]){  
			Demo16 obj=new Demo16();  
		System.out.println(obj);                    //prints the reference ID  
		obj.m();  
		}
}
