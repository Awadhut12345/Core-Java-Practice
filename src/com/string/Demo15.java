package com.string;

public class Demo15 {

	public static void main(String[] args) {
		String str = "ratan";
		System.out.println(str);
		
		String str1 =  new String("ratan");
		System.out.println(str1);
		
		char[] ch = {'r','a','t','a','n'};
		String str2 = new String(ch);
		System.out.println(str2);
		
		char[] ch1 = {'a','r','a','t','a','n','a'};
		String str3 = new String(ch1,1,4);
		System.out.println(str3);
		
		byte[] b = {65,66,67,68,69,70};
		String str4 = new String(b);
		System.out.println(str4);
		
		byte[] b1 = {65,66,67,68,69,70};
		String str5 = new String(b1,2,4);
		System.out.println(str5);
		
		StringBuffer s = new StringBuffer("ratan");
		System.out.println(s);
		
	}
}
