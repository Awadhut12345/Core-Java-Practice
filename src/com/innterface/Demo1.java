package com.innterface;

interface printable {
	public void print();
}




public class Demo1  implements printable{

	@Override
	public void print() {
		System.out.println("print....");
	}
	public static void main(String[] args) {
		Demo1 p = new Demo1();
		p.print();
	}

}
