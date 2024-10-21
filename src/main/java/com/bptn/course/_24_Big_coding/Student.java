package com.bptn.course._24_Big_coding;

public class Student {

	// Define student attributes
	private int id;
	private String name;
	private int age;

	// Constructor
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
	}

	// Getters for id and name
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// Override toString()

	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
	}
}
