package fileConcept;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\\\Users\\\\ambuj\\\\Desktop\\\\fileConcept\\\\test.txt");		
		f1.createNewFile();
		System.out.println(f1.length());
		//f1.delete();
		//System.out.println(f1.exists());
		
	}
}

