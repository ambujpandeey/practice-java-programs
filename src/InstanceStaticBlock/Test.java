package InstanceStaticBlock;

public class Test {
	
	{
		System.out.println("1 st instance block");
	}
	
	static {
		System.out.println("1st Static block");
	}
	
	public Test() {
		System.out.println("Test Constructor");
	}
	
	public static void main(String[] args) {
		Test t1 = new Test();
		System.out.println("main method");
		Test t2 = new Test();
	}
	static {
		System.out.println("Second Static Block");
	}
	{
		System.out.println("Second instance block");
	}
}








