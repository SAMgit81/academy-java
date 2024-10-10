package com.bptn.course._18_thread_examples;

public class MyRunnable implements Runnable {

	public static void main(String[] args) {
		MyRunnable myObj = new MyRunnable();

		Thread thread = new Thread(myObj);

		thread.start();

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

}

//create a class that implements runnable interface