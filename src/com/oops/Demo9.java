package com.oops;
/*832345 Ankit 1000.0
Balance is: 1000.0
40000.0 deposited
Balance is: 41000.0
15000.0 withdrawn
Balance is: 26000.0*/

class Account {
	int acc_no;
	String name;
	float amount;
	
	public void insert(int a, String n, float amt) {
		acc_no=a;
		name=n;
		amount=amt;
	}
	
	public void deposit(float amt) {
		amount=amount+amt;
		System.out.println(amt + " deposited");
	}
	
	public void withdraw(float amt) {
		if(amount<amt) {
			System.out.println("insufficient Balance");
		} else {
			amount = amount-amt;
			System.out.println(amt + "Withdrawn");			
		}
	}	
	public void checkBalance() {
		System.out.println("Balance is : "+amount);
	}
	public void display() {
		System.out.println(acc_no+" "+name+" "+amount);
	}
}
public class Demo9 {
	public static void main(String[] args) {
		Account a = new Account();
		a.insert(832345, "Ankit", 1000.0f);
		a.display();
		a.checkBalance();
		a.deposit(4000);
		a.checkBalance();
		a.withdraw(15000);
		a.checkBalance();
		
	}
}
