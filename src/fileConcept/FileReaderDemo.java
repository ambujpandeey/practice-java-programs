package fileConcept;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\\\Users\\\\ambuj\\\\Desktop\\\\fileConcept\\\\bahubali.txt");
		FileReader fr = new FileReader(f);
		char[] ch = new char[ ( (char) f.length() ) ] ;
		fr.read(ch);
		for(char ch1 : ch ) {
			System.out.println(ch1);
		}
		System.out.println(fr);
	}
}
