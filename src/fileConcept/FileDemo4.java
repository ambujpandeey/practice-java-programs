package fileConcept;

//  Write a program to display only file names 

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
	public static void main(String[] args) throws IOException {

		int count = 0;
		File f = new File("C:\\Users\\ambuj\\Desktop\\fileConcept");
		String[] s = f.list();

		for (String s1 : s) {
			File f1 = new File(f, s1);
			if (f1.isFile()) {
				count++;
				System.out.println(s1);
			}
		}
		System.out.println("Number of Files present in this directly: " + count);
	}
}
