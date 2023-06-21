package fileCconceptPrintWriter;

import java.io.*;

public class PrintWriterDemo2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File f = new File("file2.txt");
		PrintWriter pw = new PrintWriter(f);
		
		pw.println("666");
		pw.println("777");
		pw.println("888");
				
		pw.flush();
		pw.close();
	}
}
