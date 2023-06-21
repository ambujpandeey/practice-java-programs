package javaStringEx;

public class ConstructorInString {
	public static void main(String[] args) {
// type -1
		System.out.println("------------Type - 1 ----------------");
		String string = new String();
		System.out.println(string.length()); // empty String and lenght is Zero

		String string2 = new String("Durga");
		System.out.println("String Object : " + string2 + " and length is :" + string2.length());

		String string3 = "NareshIt";
		System.out.println("String Object : " + string3 + " and length is :" + string3.length());
		
// Type -2
		System.out.println("------------Type - 2 ----------------");
		char[] ch = {'a', 'b', 'c', 'd'};
		
		String s1 = new String(ch);
		System.out.println(s1);
		System.out.println(ch.equals(s1));
		
// Type -3
		System.out.println("------------Type - 3 ----------------");
		byte[] b = {100,101,102,103,104,(byte) 400};
		
		String s2 = new String(b);
		System.out.println(s2);
		
	}
}

