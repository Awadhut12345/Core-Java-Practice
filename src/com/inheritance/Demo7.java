package com.inheritance;

class Address {
	String city, state, country;
	
	public Address(String city, String state, String country) {
		this.city=city;
		this.state=state;
		this.country=country;			
	}
}

class Emp {
	int id;
	String name;
	Address address;
	
	public Emp(int id, String name, Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+ " "+address.state+" "+address.country);
	}	
}
public class Demo7 {
	public static void main(String[] args) {
		Address a = new Address("Karvenagar", "MH", "india");
		Address a1 = new Address("AA", " Mh1", "IN1");
		
		Emp e = new Emp(11, "Ram", a);
		Emp e1 = new Emp(12, "Amit", a1);
		e.display();
		e1.display();
	}
}
