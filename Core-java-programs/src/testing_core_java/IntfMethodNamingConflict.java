package testing_core_java;

public class IntfMethodNamingConflict {

	public static void main(String[] args) {
		Three three = new Three();
		three.m1();
		three.m2();
	}
}


interface Am{
	void m1();
}

interface Bm{
	void m2();
}

class One{
	
}
class Two{
	
}

class Three extends One implements Am , Bm {

	@Override
	public void m2() {
		System.out.println("from Method 2");
		
	}

	@Override
	public void m1() {
		System.out.println("from Method 1");
		
	}
	
}