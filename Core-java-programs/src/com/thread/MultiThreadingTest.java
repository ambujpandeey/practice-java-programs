package com.thread;

public class MultiThreadingTest {

	public static void main(String[] args) {
		Test t = new Test();
		Thread thread = new Thread(t);
		thread.start();
		System.out.println(thread.getName());
		System.out.println("------------------");
		thread.setName("Ambuj");
		System.out.println(thread.getName());
	}
}

class Test implements Runnable {

	@Override
	public void run() {
		System.out.println("Child Thread Calling");// position of child Thread is not fixed

	}

}