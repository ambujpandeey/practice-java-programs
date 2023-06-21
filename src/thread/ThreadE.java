package thread;

public class ThreadE {

	public static void main(String[] args) {
		MyThreadE myThreadE = new MyThreadE();

//		Thread.currentThread().setPriority(8);
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Main Thread" + Thread.currentThread().getPriority());
//		}
//		
//		System.out.println("Child" + Thread.currentThread().getPriority());
		
		
		myThreadE.setPriority(4);		
		myThreadE.start();
		
		Thread.currentThread().setPriority(10);	
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread" + Thread.currentThread().getPriority());
		}

	}
}

class MyThreadE extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread" + Thread.currentThread().getPriority());
		}
	}
}