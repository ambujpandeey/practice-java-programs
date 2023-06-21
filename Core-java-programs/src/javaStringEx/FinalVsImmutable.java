package javaStringEx;

public class FinalVsImmutable {

	public static void main(String[] args) {
		final StringBuffer sb = new StringBuffer("durga");
		sb.append("software");
		System.out.println(sb);
		
//		sb = new StringBuffer("Solution"); 
		// reassignment for reference variable not allowed if sb is final 
		System.out.println(sb);

	}

}
