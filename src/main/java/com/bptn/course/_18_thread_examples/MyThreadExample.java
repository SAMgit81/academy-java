package com.bptn.course._18_thread_examples;

class A extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hi Java");
		}
	}

}

class B extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hi SQL");
		}
	}

}

public class MyThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A myObj = new A();
		myObj.start();

		B myObj2 = new B();
		myObj2.start();

	}
}

//Class A and B are extending thread class
//the start() method executes it as a separated
// its not recommended to call run method directly because it runs directly with the context of main thread