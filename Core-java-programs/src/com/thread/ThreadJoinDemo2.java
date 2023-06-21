package com.thread;

class MyThread3 extends Thread {
	static Thread mt;

	public MyThread3(Thread mt) {
		this.mt = mt; // Assign the value passed in the constructor to mt
	}

	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class ThreadJoinDemo2 {
	public static void main(String[] args) throws InterruptedException {

		MyThread3 t = new MyThread3(Thread.currentThread());

		t.start();
		for (int i = 0; i < 5; i++) {
			Thread.sleep(2000);
			System.out.println("Main Thread");
		}
	}
}
