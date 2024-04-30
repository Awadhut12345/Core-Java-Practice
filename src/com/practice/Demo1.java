package com.practice;

 public class  Demo1 {
	private int id;
	private String name;
	
	public Demo1(int id, String name) {
		this.id =id;
		this.name=name;
		System.out.println(id);
		System.out.println(name);
	}	
	 public static final void  main(String[] args) {
		Demo1 d = new Demo1(100, "Awadhut2");
	}
}
// O/P -
// 100
// Awadhut2

 
 
 
 
//	public static void main(String[] args) {
//	Demo1 d = new Demo1(100, "Awadhut");
//	
//}

//static public void main(String[] args) {
//	Demo1 d = new Demo1(100, "Awadhut");
//}
 
 
 
 
 
 class Demo_1 {
	  private int id;
	  private String name;
	  private String address;
	  
	  public Demo_1(int id, String name, String address ) {
	   this.id=id;
	   this.name=name;
	   this.address=address;
	   
	   System.out.println("Student id "+ id);
	   System.out.println("Student name "+name);
	   System.out.println("Student address "+address);
	   
	   System.out.println(id+" "+name+" "+address);
	   }
//	   public static void main(String args[]) {
//	    Demo_1 d = new Demo_1(10, "Ratan", "Pune");
//		}
		
		static public void main(String args[]) {
		Demo_1 d = new Demo_1(11, "Ratan1", "Pune1");
		Demo_1 d1 = new Demo_1(12, "Ram", "Mumbai");
		
	}
 
 }
 
 
 
 