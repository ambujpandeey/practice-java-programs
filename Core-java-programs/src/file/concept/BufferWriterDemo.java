package file.concept;

import java.io.*;

public class BufferWriterDemo {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\\\Users\\\\ambuj\\\\Desktop\\\\fileConcept\\\\rrr.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(100);
		bw.newLine();
		
		char[] ch = {'a', 'b','c','d','e'};
		bw.write(ch);
		bw.newLine();
		
		bw.write("Best Coaching for java full stack developer is :");
		bw.newLine();
		bw.write("1. Durgasoft");
		bw.newLine();
		bw.write("2. Naresh IT");
		bw.flush();
		bw.close();
		
	}
}
