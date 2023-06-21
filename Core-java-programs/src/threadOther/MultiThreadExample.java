package threadOther;

public class MultiThreadExample {
    public static void main(String[] args) {
        // Create multiple threads
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));
        Thread thread3 = new Thread(new MyRunnable("Thread 3"));

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread " + name + " is running.");
        
        // Simulate some work
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread " + name + " is still running.");
        }
        
        System.out.println("Thread " + name + " has finished.");
    }
}
