package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
	public static void main(String[] args) {
		int count = 0;
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("abbabbbbabb");

		while (m.find()) {
			count++;
			System.out.println(m.start() + " " + m.end() + " " + m.group());
		}
		System.out.println("The Number of matched pattern : " + count);
	}
}
