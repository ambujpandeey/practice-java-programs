package com.thread;

public class ThreadA {

	public static void main(String[] args) {

		MyThreadA myThreadA = new MyThreadA();

		myThreadA.start();
		
		// at the time of "myThread.start()" a new thread will be created which is
		// responsible for the execution for the "run()" method

		// In this case the output will never be same,
		// Thread Scheduler will decide which one will execute first
		
//		myThreadA.run();
		// at the time of "myThreadB.start()" no new thread will be created and run() method will be 
		// executed just like a normal method by the main Thread		
		// In this case the output will always be same 
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Parent Thread");
		}
		
		//After starting a Thread we are not allowed to restart the same Thread once again
//		myThreadA.start(); // java.lang.IllegalThreadStateException
	}
}

class MyThreadA extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
	}
}
