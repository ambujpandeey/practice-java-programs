package regular.expression;

import java.io.*;
import java.util.regex.*;

class RegularExpressionDemo3 {
	public static void main(String[] args) throws IOException {
		int count = 0;
		Pattern p = Pattern.compile("[a-zA-Z0-9-$.]+[.]txt");
		File f = new File("C:\\Users\\ambuj\\eclipse-workspace\\testing_core_java");
		String[] s = f.list();
		for (String s1 : s) {
			Matcher m = p.matcher(s1);
			if (m.find() && m.group().equals(s1)) {
				count++;
				System.out.println(s1);
			}
		}
		System.out.println(count);
	}
}