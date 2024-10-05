package com.bptn.course._week2_friday_exersice;

class Employee {
	// Instance variable to store salary
	private double salary;

	// Instance variable to store hours per day worked by employee
	private int hoursPerDay;

	// Constructor to set instance variables(salary and hoursPerDay) value
	public Employee(double salary, int hoursPerDay) {
		setSalary(salary);
		setHoursPerDay(hoursPerDay);
	}

	// Set method to update salary
	public void setSalary(double salary) {
		if (salary < 500) {
			// if less than 500 add 10
			this.salary = salary + 10;
		} else {
			// remian unchanged
			this.salary = salary;
		}
	}

	// Set method to update hoursPerDay
	public void setHoursPerDay(int hoursPerDay) {
		this.hoursPerDay = hoursPerDay;
		if (hoursPerDay > 6) {
			this.salary += 5;
		}
	}

	// Get method to return salary
	public double getSalary() {
		return this.salary;
	}

	public static void main(String[] args) {
		// create an instance of Employee class and initialize it with salary = 100 and
		// hoursPerDay = 8
		Employee student = new Employee(100, 8);

		// print the salary of the employee
		System.out.println(student.getSalary());
	}
}
