package file.concept;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\\\Users\\\\ambuj\\\\Desktop\\\\fileConcept\\\\bahubali.txt");
		int i =  fr.read();
		
		while (i != -1) {
			System.out.println((char)i);
			i = fr.read();			
		}
		//System.out.println(fr.read());
	}
}
