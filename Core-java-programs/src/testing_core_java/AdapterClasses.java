package testing_core_java;

public class AdapterClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test3 test3 = new Test3();
		test3.m3();
		test3.m2();
		System.out.println("--------------------------------------");
		Test4 test4 = new Test4();
		test4.m7();
		test4.m8();

	}

}


interface X{
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
	void m6();
	void m7();
	void m8();
	void m9();
	void m10();
}

abstract class AdapterX implements X{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m6() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m7() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m8() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m9() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m10() {
		// TODO Auto-generated method stub
		
	}
}

class Test3 extends AdapterX  {
	
	public void m3(){
		System.out.println("method 3 called");
	}
	
}


class Test4 extends AdapterX {
	public void m8() {
		System.out.println("method 8 called");
	}
}







