package com.bptn.course._20_java_synchronized_coding3_11;

public class SynchronizedPrinter {

	void printNumbers() {

		// Lock the object
		synchronized (this) {
			System.out.println("Inside of the synchronized block.");

			for (int i = 0; i < 5; i++) {
				System.out.println(i + 1);
				try {
					Thread.sleep(500);
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
			}

		}
	}
}
