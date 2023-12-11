package aa;

public class ReverseString {

	public static void main(String[] args) {
		String string = "Ambuj Kumar Pandey";

		char[] chars = string.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = chars.length - 1; i >= 0; i--) {
			sb.append(chars[i]);
		}
		System.out.println("Reverse String : " + sb);
		
		System.out.println("==================================================");
		
		String str = "Shanat Kumar Pandey";

		String[] split = str.split("\\s");

		String splitstring1 = split[0];
		String splitstring2 = split[1];
		String splitstring3 = split[2];

		System.out.println(split[0] + split[1] + split[2]);

		char[] splitstring1Chars = splitstring1.toCharArray();
		StringBuilder sb1 = new StringBuilder();
		for (int i = splitstring1Chars.length - 1; i >= 0; i--) {
			sb1.append(splitstring1Chars[i]);
		}
		System.out.println("splitstring1Chars :" + sb1);
		
		System.out.println("==================================================");

		
	}

}
