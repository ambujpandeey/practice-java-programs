package testingCoreJava;

public class EnhancedForLoopEx {
	public static void main(String[] args) {
		int[] x= {10,20,30,40,50};
		
		System.out.println("--------------------------------");
		System.out.println("By using for loop");
		System.out.println("--------------------------------");
		for(int i=0; i<x.length; i++) {
			
			System.out.println(x[i]);
		}
		
		System.out.println("--------------------------------");
		System.out.println("By using for each loop");
		System.out.println("--------------------------------");
		int[] y = {11,22,33,44,55};
		
		for(int y1:y) {
			System.out.println(y1);
		}
		
	}
}







