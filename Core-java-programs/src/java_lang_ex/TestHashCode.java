package java_lang_ex;

public class TestHashCode {
	int i;

	public TestHashCode(int i) {
		this.i = i;
	}

	public int hashCode() {
		return i;
	}

	public String toString() {
		return i + "";
	}

	public boolean equals(Object o) {
		try {
			TestHashCode thc = (TestHashCode) o;
			if (i == thc.i) {
				return true;
			} else {
				return false;
			}
		} catch (ClassCastException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
	}

	public static void main(String[] args) {
		TestHashCode t1 = new TestHashCode(10);
		TestHashCode t2 = new TestHashCode(10);
		TestHashCode t3 = t1;

		System.out.println(t1.hashCode()); // 10
		System.out.println(t2.hashCode()); // 10

		System.out.println(t1 == t2); // false  
		System.out.println(t1.equals(t2)); // false  // by overriden equals() -> True
		System.out.println(t1.equals(t3)); // True   // by overriden equals() -> True
	}
}
