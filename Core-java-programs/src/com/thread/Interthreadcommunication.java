package com.thread;

public class Interthreadcommunication {

	public static void main(String[] args) {
	
		
		C c = new C();

		A a = new A(c);
		B b = new B(c);
		
		a.start();
		//a.interrupt();
		b.setName("mydemon");
		b.setDaemon(true);
		b.start();

	}

}

class A extends Thread {
	C c;

	A(C c) {
		this.c = c;
	}

	public void run() {
		synchronized (c) {
			try {
				c.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("A class running");
			System.out.println("A class running");
			
			System.out.println("A class running");
			System.out.println("A class running");
			System.out.println("A class running");
			System.out.println("A class running");
			
		}

	}

}

class B extends Thread {
	C c;

	B(C c) {
		this.c = c;
	}

	public void run() {
		synchronized (c) {
			//c.notify();
			
			System.out.println("b class running");
			System.out.println("b1 class running");
			System.out.println("b2 class running");
			System.out.println("b3 class running");
			System.out.println("b4 class running");
			System.out.println("b5 class running");
			c.notify();
			
		}
	}

}

class C {

}