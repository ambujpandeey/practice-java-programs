package com.thread;

public class ThreadB {

	public static void main(String[] args) {

		MyThreadB myThreadB = new MyThreadB();

		myThreadB.start();
//		myThreadB.run(1);

	}
}

class MyThreadB extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("no arg method");
		}
	}

	public void run(int j) {
		for (j = 0; j < 5; j++) {
			System.out.println("int arg method");
		}
	}

}
