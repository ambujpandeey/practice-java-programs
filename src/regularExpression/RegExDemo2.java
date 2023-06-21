package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo2 {
	public static void main(String[] args) {
		int count = 0;
		Pattern p = Pattern.compile("[^0-9a-zA-Z]");
		Matcher m = p.matcher("a1b7@z#D");

		while (m.find()) {
			count++;
			System.out.println(m.start() + " " + m.end() + " " + m.group());
		}
		System.out.println("The Number of matched pattern : " + count);
	}
}
