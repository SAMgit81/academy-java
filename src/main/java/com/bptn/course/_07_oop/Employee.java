package com.bptn.course._07_oop;

public class Employee {

	// instance variable

	private String name;
	private int employeeId;
	private int age;

	// constructors
	public Employee() {
		this.name = "John";
		this.employeeId = 100;
		this.age = 40;
	}

	// Parameterized constructor with 2 parameters
	public Employee(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}

	public Employee(String name, int employeeId, int age) {
		this.name = name;
		this.employeeId = employeeId;
		this.age = age;
	}

	public void printInfo() {
		System.out.println("Employee name: " + this.name + " EmployeeId " + this.employeeId + " Age: " + this.age);
	}

	public static void main(String[] args) {

		// create objects from this class
		Employee e1 = new Employee();
		e1.printInfo();

		Employee e2 = new Employee("John Doe", 1234);
		e2.printInfo();

		Employee e3 = new Employee("Jane Smith", 5647, 30);
		e3.printInfo();

	}

}
