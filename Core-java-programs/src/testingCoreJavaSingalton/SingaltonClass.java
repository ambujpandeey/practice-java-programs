package testingCoreJavaSingalton;

class TestSin {
	private static TestSin ts = null; // create object when first request came

	private TestSin() {

	}

	public static TestSin getTestSin() {
		
		if (ts==null) {
			ts = new TestSin();			
		}
		return ts;
	}

}

public class SingaltonClass {
	public static void main(String[] args) {
		TestSin t1 = TestSin.getTestSin();
		System.out.println(t1);

		TestSin t2 = TestSin.getTestSin();
		System.out.println(t2);

		System.out.println(TestSin.getTestSin().hashCode());

		System.out.println(TestSin.getTestSin().hashCode());
	}
}
