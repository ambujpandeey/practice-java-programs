package threadOther;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {

	public static void main(String args[]) throws Exception {
		MyCallable[] jobs = { new MyCallable(10), new MyCallable(20), new MyCallable(30), new MyCallable(40),
				new MyCallable(50), new MyCallable(60) };
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (MyCallable job : jobs) {
			Future f = service.submit(job);
		
			System.out.println(f.get());
		}
		service.shutdown();
	}

}

class MyCallable implements Callable {
	int num;

	MyCallable(int num) {
		this.num = num;
	}

	public Object call() throws Exception {
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum = sum + i;
		}
		return sum;
	}
}