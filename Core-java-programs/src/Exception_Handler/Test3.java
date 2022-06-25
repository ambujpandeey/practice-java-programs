package Exception_Handler;

class Test3 {
	public static void main(String[] args) throws InterruptedException {
		doStuff();
		System.out.println("Calling main()");
	}

	public static void doStuff() throws InterruptedException  {
		doMoreStuff();
		System.out.println("Calling doStuff()");
	}

	public static void doMoreStuff() throws InterruptedException  {
		Thread.sleep(5000);
		System.out.println("Calling doMoreStuff()");
	}
}