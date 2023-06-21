package com.thread;

public class RunnableA {

	public static void main(String[] args) {

		MyThreadD myThreadD = new MyThreadD();

		Thread t = new Thread(myThreadD);

		t.start();

		for (int i = 0; i <= 5; i++) {
			System.out.println("Main Thread Calling...");
		}
//		myThreadD.start();// The method start() is undefined for the type MyThreadD
	}
}

class MyThreadD implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child of Runnable calling...");
		}

	}
}
