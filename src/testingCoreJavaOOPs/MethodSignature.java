package testingCoreJavaOOPs;

public class MethodSignature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.m1(12);

		System.out.println("--------------------");

		test.m1(66, 55);
		System.out.println("--------------------");

		double m = (double) test.m1();
		System.out.println(m);

		System.out.println("--------------------");
		System.out.println(test.m1());
		System.out.println("--------------------");

		test.m1(46);

	}
}

class Test {

	public void m1(int i) {
		System.out.println(i); // 12
	}

	public void m1(int i, int k) {
		System.out.println(k); // 66 55 
	}

	public int m1() {
		return 1099;
	}

	// within same class we can't declear 2 method with same signature

	/*
	 * public void m1(int n) { System.out.println(n); // 46
	 * 
	 * }
	 */

}
