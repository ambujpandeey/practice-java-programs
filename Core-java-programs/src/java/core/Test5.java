package java.core;

interface Aaa {
	void a();

	void b();

	void c();

	void d();
}

class Bbb implements Aaa {

	@Override
	public void a() {
		// TODO Auto-generated method stub
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
	}

	@Override
	public void c() {
		System.out.println("I am C");
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
	}
}

class M extends Bbb {
	public void a() {
		System.out.println("I am A");
	}

	public void d() {
		System.out.println("I am D");
	}
}

public class Test5 {
	public static void main(String[] args) {
		Aaa objA = new M();
		objA.a();
		objA.b();
		objA.c();
		objA.d();
	}
}
