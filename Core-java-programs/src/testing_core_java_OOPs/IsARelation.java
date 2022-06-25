package testing_core_java_OOPs;

public class IsARelation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parentt p1 = new Parentt();
		p1.m1();
		// p1.m2(); // compile time error
		
		System.out.println("---------------------------");
		
		Child c1 = new Child();
		c1.m1();
		c1.m2();
		
		System.out.println("---------------------------");
		
		Parentt p2 = new Child();
		p2.m1();
		// p2.m2(); // compile time error
		
		System.out.println("---------------------------");
		
		// Child c2 = new Parentt(); // cant hold, incompatibal type
	}

}


class Parentt{
	void m1() {
		System.out.println("Parent - method 1");
	}
}

class Child extends Parentt {
	void m2() {
		System.out.println("Child - method 2");
	}
}
