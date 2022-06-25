package java.core;

class Test4 {
	void m1() {
		System.out.println("m1() is called");
	}
}

class Test2 extends Test4 {
	void m2() {
		System.out.println("m2() is called");
	}
}

class Test extends Test2{
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.m1();
		t2.m2();
	}
}

