package javaCore;

abstract class B {	
	abstract void calculation();
}
public class A extends B{
		
	@Override
	void calculation() {
		int a = 22;
		int b = 6347;
		long c;
		System.out.println("Calculation Working... ");
		c =  a + b;
		System.out.println("Result = "+c);
	}
	
	public static void main(String[] args) {
		B b1 = new A();
		b1.calculation();
		System.out.println("Calculation Done");
	}
}
