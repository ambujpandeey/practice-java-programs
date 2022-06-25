package java_String_ex;

public class ConCatMethod {
	public static void main(String[] args) {
		// type
		String string = new String("Durga");
		String string2 = string.concat("Software");
		System.out.println(string);
		System.out.println(string2);
		// type
		String string3 = string + "Soft";
		System.out.println(string3);
		// type
		System.out.println("--------------------------------");
		String string4 = string.concat("Software");
		System.out.println(string2 == string4); // false
		System.out.println(string2.equals(string4));
		System.out.println("--------------------------------");
// type		
		String string5 = "Naresh";
		System.out.println(string5);
		string5 = string5 + " IT";
		System.out.println(string5);
		string5 += " Hyderabad";
		System.out.println(string5);
		System.out.println("And Lenth is : " + string5.length());

	}

}
