package com.practice.collection;

import java.util.ArrayList;

public class Demo26 {

	int eid;
	String ename;
	Demo26(int eid, String ename) {
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
		
	//	System.out.println(al);
	//	System.out.println(al.toString());
		
		for(Object o :al) {
			if(o instanceof Integer) {
				System.out.println(o.toString());
			}
			if(o instanceof Character) {
				System.out.println(o.toString());
			}
			if(o instanceof Demo26) {
					Demo26 dd =(Demo26) o;
					System.out.println(dd.eid+"--"+dd.ename);
			}
			if(o instanceof Demo27) {
					Demo27 d3 = (Demo27) o;
					System.out.println(d3.sid+"--"+d3.sname);
			}
		}
		
		
		
	}
}
class Demo27 {
	int sid;
	String sname;
	Demo27(int sid, String sname) {
		this.sid=sid;
		this.sname=sname;
	}	
}
