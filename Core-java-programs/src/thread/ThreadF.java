package thread;

class ThreadF extends Thread {

	public void run() {
		System.out.println("Inside run method" + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {

		Thread.currentThread().setPriority(6);

		System.out.println("main thread priority : " + Thread.currentThread().getPriority());

		ThreadF t1 = new ThreadF();

		System.out.println("t1 thread priority : " + t1.getPriority());
		t1.start();
	}
}
