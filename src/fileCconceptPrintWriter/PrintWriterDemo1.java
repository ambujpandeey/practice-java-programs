package fileCconceptPrintWriter;

import java.io.*;

public class PrintWriterDemo1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File f = new File("file1.txt");
		PrintWriter pw = new PrintWriter(f);
		
		pw.println("aaa");
		pw.println("bbb");
		pw.println("ccc");
				
		pw.flush();
		pw.close();
	}
}
