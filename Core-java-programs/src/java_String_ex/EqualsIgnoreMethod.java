package java_String_ex;

public class EqualsIgnoreMethod {

	public static void main(String[] args) {
		String string = new String("java");
		String string2 = new String("JAVA");
		
		System.out.println(string==string2); // false
		System.out.println(string.equals(string2)); // false
		
		System.out.println(string.equalsIgnoreCase(string2)); // true

	}

}
