package fileCconceptPrintWriter;

import java.io.*;

public class MurgerFileData {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws NullPointerException, IOException {
		PrintWriter pw = new PrintWriter("file3.txt");

		BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
		String line = br.readLine();
		while (line != null) {
			pw.println(line);
			System.out.println(line);
			line = br.readLine();
		}
		// pw.flush();
		br = new BufferedReader(new FileReader("file2.txt"));
		line = br.readLine();
		while (line != null) {
			pw.println(line);
			System.out.println(line);
			line = br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();

	}

}
