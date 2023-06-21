package thread;

class MyThread4 extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("i am lazy Thread : " + i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("i got interrupted");
		}
	}
}

public class ThreadInterruptDemo {
	public static void main(String[] args) {
		MyThread4 t = new MyThread4();
		t.start();
//		t.interrupt(); // --->1
		// If we are commenting line 1 then main Thread won't interrupt child Thread and
		// hence child Thread will be continued until its completion.
		System.out.println("end of main thread");
	}
}
