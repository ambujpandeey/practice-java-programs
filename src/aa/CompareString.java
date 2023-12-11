package aa;

public class CompareString {

	public static void main(String[] args) {
		
		String string = "Ambuj";
		String string2 = "Shanat";
		
//		System.out.println(string.compareTo(string2));
		
		
		// Initializing Strings
        String str1 = "geeks";
        String str2 = "gEEkS";
        String str3 = "gEEkS";
 
        // Checking if geeksforgeeks string equates to geeksforgeeks string case sensitive
        System.out.print("Difference of geeks and gEEkS (case sensitive) : ");
        System.out.println(str1.compareTo(str2));
 
        // Checking if geeksforgeeks string equates to astha string
        // case insensitive using compareToIgnoreCase()
        System.out.print("Difference of geeks and gEEkS (case insensitive) : ");
        System.out.println(str1.compareToIgnoreCase(str2));
        
        System.out.println("--------------------------------------------------");

        System.out.println(str1 == str2);  
        System.out.println(str2 == str3);  
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
		
	}
}
