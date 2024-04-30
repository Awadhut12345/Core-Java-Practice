package com.practice.collection;

import java.util.ArrayList;

public class Demo24 {

	int eid;
	String ename;
	Demo24(int eid, String ename) {
		this.eid=eid;
		this.ename=ename;
	}
	
	public static void main(String[] args) {
		Demo24 d = new Demo24(111, "ratan");
		Demo25 d1 = new Demo25(121, "Anu");
		ArrayList al = new ArrayList<>();
		al.add(10);
		al.add('a');
		al.add(d);
		al.add(d1);
		
		System.out.println(al);
		System.out.println(al.toString());
	}
}
class Demo25 {
	int sid;
	String sname;
	Demo25(int sid, String sname) {
		this.sid=sid;
		this.sname=sname;
	}	
}
class Test {
	
	
}
