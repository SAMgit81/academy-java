package com.bptn.course._throws_example;

public class Employee {

	public static void main(String[] args) {
		// create an instance of Employee class and initialize it with salary = 100 and
		// hoursPerDay = 8
		Employee student = new Employee(100, 8);

		// print the salary of the employee
		System.out.println(student.getSalary());
	}

	// Instance variable to store salary
	private int salary;

	// Instance variable to store hours per day worked by employee
	private int hoursPerDay;

	// Constructor to set instance variables(salary and hoursPerDay) value
	public Employee(int salary, int hoursPerDay) {
		this.salary = salary;
		this.hoursPerDay = hoursPerDay;
	}

	// Set method to update salary
	public void setSalary() {
		if (salary < 500) {
			salary = salary + 10;
		} else {
			;
		}
	}

	// Set method to update hoursPerDay
	public void setHoursPerDay() {
		if (hoursPerDay > 6) {
			salary = salary + 5;
		} else {

		}
	}

	// Get method to return salary
	public int getSalary() {
		return salary;
	}
}
