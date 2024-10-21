package com.bptn.course._24_Big_coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Import all necessary packages here

public class ListToMap {

	// create static method "convertStudentListToMap"
	public static Map<Integer, Student> convertStudentListToMap(List<Student> studentList) {
		Map<Integer, Student> studentMap = new HashMap<>();
		// Populate the map with student id as key and student object as value
		for (Student student : studentList) {
			studentMap.put(student.getId(), student);
		}
		return studentMap;
	}

	// Complete the main method
	public static void main(String[] args) {

		// Create a list of students
		List<Student> students = new ArrayList<>();
		// add student objects to this list
		students.add(new Student(1, "Alice", 20));
		students.add(new Student(2, "Bob", 22));
		students.add(new Student(3, "Charlie", 21));
		// Call "convertStudentListToMap" method and hold the returned value in
		// "studentMap" variable.
		Map<Integer, Student> studentMap = convertStudentListToMap(students);
		// Print the map
		System.out.println("Students Map: " + studentMap);
	}
}
