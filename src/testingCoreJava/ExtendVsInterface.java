package testingCoreJava;

public class ExtendVsInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interf interf = new Interf();
		interf.m1();
		interf.m2();
		interf.m3();
		interf.m4();

	}

}


interface A{
	void m1();
}

interface B{
	void m2();
}

interface C{
	void m3();
}

interface D extends A, B, C{
	void m4();
}

class Interf  implements D  {

	@Override
	public void m1() {
		System.out.println("from interface A and Method 1");
		
	}

	@Override
	public void m2() {
		System.out.println("from interface B and Method 2");
		
	}

	@Override
	public void m3() {
		System.out.println("from interface C and Method 3");
		
	}

	@Override
	public void m4() {
		System.out.println("from interface D and Method 4");
		
	}
	
}