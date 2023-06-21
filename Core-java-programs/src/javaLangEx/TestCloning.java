package javaLangEx;

public class TestCloning implements Cloneable {
	int i = 10;
	int j = 20;

	public static void main(String[] args) throws CloneNotSupportedException {

		TestCloning t1 = new TestCloning();
		TestCloning t2 = (TestCloning) t1.clone();

		t2.i = 888;
		t2.j = 999;

		System.out.println(t1.i + "..............." + t1.j); // 10.........20
		System.out.println(t2.i + "..............." + t2.j); // 888........999
	}
}
