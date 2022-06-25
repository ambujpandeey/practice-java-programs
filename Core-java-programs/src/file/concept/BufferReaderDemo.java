package file.concept;

import java.io.*;

public class BufferReaderDemo {
	public static void main(String[] args) throws IOException {
		File f = new File("file2.txt");
		FileReader fw = new FileReader(f);
		BufferedReader bw = new BufferedReader(fw);

		String string = bw.readLine();

		while (string != null) {
			System.out.println(string);
			string = bw.readLine();
		}
		bw.close();
	}
}
