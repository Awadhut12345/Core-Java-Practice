package com.java.projects;
import java.util.ArrayList;
import java.util.Scanner;

 class Employee {
	private String name;
	private int age;
	private double salary;
	private String department;
	
	
	public Employee(String name, int age, double salary, String department) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.department=department;
	}
	public String getName() {
		return name;
	}	
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	public String getDepartment() {
		return department;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", department=" + department + "]";
	}
}


public class EmpMang {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Employee> employees = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Salary: ");
            double salary = Double.parseDouble(scanner.nextLine());

            System.out.print("Department: ");
            String department = scanner.nextLine();

            employees.add(new Employee(name, age, salary, department));
        }

        System.out.println("\nEmployee List:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        scanner.close();
    }

}