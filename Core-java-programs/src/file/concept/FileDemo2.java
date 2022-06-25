package file.concept;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\\\Users\\\\ambuj\\\\Desktop\\\\fileConcept\\\\durgaSoft");		
		f1.mkdir();
		File f2 = new File(f1, "abc.txt");
	//	File f2 = new File("ambuj123", "abc.txt");
		f2.createNewFile();
		System.out.println(f2.exists());
		
	}
}


