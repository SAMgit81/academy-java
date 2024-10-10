package com.bptn.course._18_thread_examples;

public class ThreadExample extends Thread {

	// Create constructor
	public ThreadExample(String name) {
		super(name);

	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println(i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {

		ThreadExample t1 = new ThreadExample("Thread 1");
		ThreadExample t2 = new ThreadExample("Thread 2");
		// states of the threads
		System.out.println("States of the thread: " + t1.getState() + " " + t2.getState());
		;
		// Create a concurrent thread
		t1.start();
		t2.start();

		System.out.println("States of the thread: " + t1.getState() + " " + t2.getState());

		// join method
		t1.join();
		t2.join();

		System.out.println("Executing the main thread");

		System.out.println("The name of the thread is: " + t1.getName() + " " + t2.getName());

		System.out.println("States of the thread: " + t1.getState() + " " + t2.getState());

	}

}
