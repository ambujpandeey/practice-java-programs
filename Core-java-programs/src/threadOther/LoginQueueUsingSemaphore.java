package threadOther;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;

public class LoginQueueUsingSemaphore {

	private Semaphore semaphore;

	public LoginQueueUsingSemaphore(int slotLimit) {
		semaphore = new Semaphore(slotLimit);
	}

	boolean tryLogin() {
		return semaphore.tryAcquire();
	}

	void logout() {
		semaphore.release();
	}

	int availableSlots() {
		return semaphore.availablePermits();
	}

	public static void main(String[] args) {
		int slots = 10;
		ExecutorService executorService = Executors.newFixedThreadPool(slots);
		LoginQueueUsingSemaphore loginQueue = new LoginQueueUsingSemaphore(slots);
		IntStream.range(0, 14).forEach(user -> executorService.execute(loginQueue::tryLogin));
		executorService.shutdown();
		System.out.println(loginQueue.availableSlots());

//        assertEquals(0, loginQueue.availableSlots());
//		loginQueue.logout();
		System.out.println(loginQueue.availableSlots());
		System.out.println(loginQueue.tryLogin());
//        assertTrue(loginQueue.availableSlots() > 0);
//        assertTrue(loginQueue.tryLogin());
	}
}
