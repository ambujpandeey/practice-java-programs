package testingCoreJava;

public class AbstractTesting {

	public static void main(String[] args) {
		Parent parent = new Child2();
		parent.showId();
		parent.getMarried();
		parent.getProperty();
	}

}

abstract class Parent{
	
	abstract void getProperty();
	abstract void showId(); 
	
	public abstract void show1(); {
	}
		
	private void show2() {
	}
	
	protected abstract void show3(); {
	}
	
	/*
	 * default void show4() { } // illegal decleration
	 */
	
	static void show5() {
	}
	
	synchronized void show6() {
	}
	
	strictfp void show7() {
	}
		
	native void show9(); 
		
	final void getMarried() {
		System.out.println("Marrid with subba-laxmi");
	}	
		
}

abstract class Child1 extends Parent{

	@Override
	void getProperty() {
		System.out.println("property transfered from parent");		
	}
}

class Child2 extends Child1{
	
	@Override
	void showId() {
		System.out.println("id matched and verification completed");		
	}

	@Override
	protected void show3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		
	}
	
}
