package testingCoreJavaOOPs;

public class MethodSignature2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 test = new Test1();
		test.m1(12);

		System.out.println("--------------------");
		test.m1(888888,23344);
	}
}

class Test1 {

	public void m1(int i) {
		System.out.println("-->" + i); // 12
	}

	public void m1(int j, int k) {
		System.out.println(j + "  " +k); // 66 55
	}

}
