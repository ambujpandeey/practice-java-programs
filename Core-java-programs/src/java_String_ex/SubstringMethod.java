package java_String_ex;

public class SubstringMethod {

	public static void main(String[] args) {
// substring() 		
		String string = new String("DuraSoftware");

		String s1 = string.substring(3);
		String s2 = string.substring(4, 9);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("-----------------------");

// replace()		
		String string2 = "abababa";
		System.out.println(string2.replace('a', 'b'));

		System.out.println("-----------------------");

		String string3 = "abababa";
		System.out.println(string3.replace('b', 'a'));

// toUpperCase()		
		String string4 = "DuRgaSoFt";
		System.out.println(string4.toUpperCase());

// toLowerCase()		
		String string5 = "DuRgaSoFt";
		System.out.println(string5.toLowerCase());

// trim()
		String string6 = "   Ambuj     Pandey             ";
		System.out.println(string6.trim());
		
// indexOf() and lastIndexOf() 
		String string7 = "bbbbambujaaaaa";
		System.out.println(string7.indexOf('a'));
		System.out.println(string7.lastIndexOf('a'));
		System.out.println(string7.indexOf('d'));
		System.out.println(string7.lastIndexOf('z'));
	}

}
