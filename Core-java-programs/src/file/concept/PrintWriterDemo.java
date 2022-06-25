package file.concept;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File f = new File("C:\\\\Users\\\\ambuj\\\\Desktop\\\\fileConcept\\\\dabang.txt");
		PrintWriter pw = new PrintWriter(f);
		pw.print(true);
		pw.print(12);
		pw.print(4554.55);
		pw.print('a');
		pw.print("Durga Soft");
		pw.println();
		pw.println(true);
		pw.println(12);
		pw.println(12.55);
		pw.println('a');
		pw.println("Durga Soft");
		
		pw.append("111111111111122222222222222222eeeeeeeeeeeeeeeeeeeeetttttttttttttt");
		
		pw.flush();
		pw.close();

	}

}
