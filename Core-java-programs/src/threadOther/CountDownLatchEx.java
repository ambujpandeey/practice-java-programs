package threadOther;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
	public static void main(String[] args) {
		CountDownLatch countDownLatch = new CountDownLatch(10);
		Thread t = new Thread(() -> {
		    countDownLatch.countDown();
		    countDownLatch.countDown();
		    countDownLatch.countDown();
		    countDownLatch.countDown();
		    countDownLatch.countDown();
	
	
	
		});
		t.start();
		
		Thread t1 = new Thread(() -> {
			
			System.out.println("--------------------------------");
		    countDownLatch.countDown();
		    countDownLatch.countDown();
		    countDownLatch.countDown();
		    countDownLatch.countDown();
		    countDownLatch.countDown();
	
	
	
		});
		t1.start();
	
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		assertEquals(0, countDownLatch.getCount());
		System.out.println(countDownLatch.getCount());
	}

}
