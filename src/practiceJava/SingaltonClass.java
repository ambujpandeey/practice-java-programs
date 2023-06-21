package practiceJava;

class Test{
	public static Test t = new Test();
	public Test() {
		
	}
	
	public static Test getTest () {
		return t;
	}
}


public class SingaltonClass {
	public static void main(String[] args) {
		
		Test t1 = new Test();
		Test t2 = new Test();
		
		System.out.println(t1.getClass().getName().hashCode());
		System.out.println(t2.getClass().getName().hashCode());
	}
}
