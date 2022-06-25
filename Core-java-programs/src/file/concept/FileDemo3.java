package file.concept;

//  Write a program to display the names of all files and directories present in C:\\Users\\ambuj\\Desktop\\fileConcept .

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
	public static void main(String[] args) throws IOException {

		int count = 0;
		File f1 = new File("C:\\Users\\ambuj\\Desktop\\fileConcept");
		String[] f2 = f1.list();

		for (String f : f2) {
			count++;
			System.out.println(f);
		}
		System.out.println("Number of Files present in this directly: " + count);
	}
}
