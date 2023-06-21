package testingCoreJavaSingalton;

class Test{
	private static Test t = new Test(); // create object at beginning
	private Test(){
		
	}
	
	public static Test getTest() {
		return t;
	}
}

public class Singalton {

	public static void main(String[] args) {
		Test t1 = Test.getTest();
		Test t2 = Test.getTest();
		System.out.println("-----------------------------------");
		System.out.println(t1);
		System.out.println(t2);
		System.out.println("-----------------------------------");
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println("-----------------------------------");

	}

}
