package com.onlogic.practice;

public class Demo1 {	
	public static void main(String[] args) {		
		
		float a = 29f;
		int aa = (int)a;
		
		double d = a;
		long l =(long)a;
		short s =(short) a;
		
		System.out.println(a);
		System.out.println(aa);
		System.out.println(d);
		System.out.println(l);
		System.out.println(s);
		
		
		double dd =100d;
		float ff =(float)dd;
		int ii = (int)dd;
		short ss = (short)dd;
		
		double iii = (double)dd;
	//	String sss = (String)dd;		// Compile time error
		
		
		System.out.println(dd);
		System.out.println(ff);
		System.out.println(ii);
		System.out.println(ss);
		System.out.println(iii);		
	}

}
