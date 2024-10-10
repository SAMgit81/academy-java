package com.bptn.course._20_java_synchronized_coding3_11;

public class MyThread extends Thread {

	SynchronizedPrinter printer;

	// Create a constructor to initialize the printer instance variable.
	public MyThread(SynchronizedPrinter printer) {

		this.printer = printer;
	}

	@Override
	public void run() {
		this.printer.printNumbers();

	}
	// Override the run() method to call printNumbers() method of the printer
	// instance variable.
}
