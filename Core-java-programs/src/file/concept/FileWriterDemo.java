package file.concept;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw = new FileWriter("C:\\\\Users\\\\ambuj\\\\Desktop\\\\fileConcept\\\\bahubali.txt", true);
		//f1.append("Hyderabad best Coaching for java language is :");
		fw.write(100);
		System.out.println("\n");
		fw.write("urga Software \n");
		char[] ch = {'a','b','c'};
		fw.write(ch);
		System.out.println("\n");
		//f1.append("Hyderabad best Coaching for java language is : Naresh it");
		fw.flush();
		fw.close();
		
		
	}

}
