package regular.expression;

import java.io.*;
import java.util.regex.*;

// Write a program to extract all valid mobile numbers from a file.
class RegularExpressionDemo2 {
	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter("output.txt");
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		String line = br.readLine();
		while (line != null) {
			Matcher m = p.matcher(line);
			while (m.find()) {
				out.println(m.group());
			}
			line = br.readLine();
		}
		out.flush();
		out.close();
		br.close();
	}
}
