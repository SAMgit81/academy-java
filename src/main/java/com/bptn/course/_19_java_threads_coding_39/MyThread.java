package com.bptn.course._19_java_threads_coding_39;

import java.util.List;

public class MyThread extends Thread {

	// Declare an instance variable of type List<Integer>

	List<Integer> list;

	// Create a parameterized constructor.
	public MyThread(String name, List<Integer> list) {
		super(name);
		this.list = list;

	}

	// Override the run() method here.
	@Override

	public void run() {
		ListUtils.insertNextId(list);

	}
}