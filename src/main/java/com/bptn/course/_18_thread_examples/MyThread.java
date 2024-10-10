package com.bptn.course._18_thread_examples;

public class MyThread extends Thread {

	// declare a variable

	int limitToStop;

	public static void main(String[] args) {
		// create my thread instance and pass 20
		MyThread thread = new MyThread(20);
		// start the thread
		thread.start();

	}

	// Create a constructor to initialize the above instance variable
	public MyThread(int limitToStop) {
		this.limitToStop = limitToStop;
	}

	// Override the run() method here.
	public void run() {
		for (int i = 0; i < limitToStop; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}

}
