package threadOther;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierEx {
	public static void main(String[] args) {
		CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
		Thread t = new Thread(() -> {
		    try {
		        cyclicBarrier.await();
		          
		        System.out.println("Cyclic Varrie running...");
		    } catch (InterruptedException | BrokenBarrierException e) {
		        // error handling
		    }
		});
		t.start();
		
		//---------------------
		
		Thread t1 = new Thread(() -> {
		    try {
		        cyclicBarrier.await();
		       
		        System.out.println("Cyclic Varrie running...");
		    } catch (InterruptedException | BrokenBarrierException e) {
		        // error handling
		    }
		});
		t1.start();
		
		

		System.out.println( cyclicBarrier.getNumberWaiting());
		System.out.println(cyclicBarrier.isBroken());
		
//		assertEquals(1, CYCLICBARRIER.GETNUMBERWAITING());
//		assertFalse(cyclicBarrier.isBroken());
	}

}
