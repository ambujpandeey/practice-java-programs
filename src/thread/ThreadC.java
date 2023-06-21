package thread;

public class ThreadC {

	public static void main(String[] args) {
		MyThreadC myThreadC = new MyThreadC();
		myThreadC.start();
		System.out.println("Main Thread called");

	}
}

class MyThreadC extends Thread {

	public void start() {
//		super.start(); // run() method called
//		this.start(); // stackOverFlowError
		System.out.println("start() method called");
	}

	public void run() {
		System.out.println("run() method called");
	}
}