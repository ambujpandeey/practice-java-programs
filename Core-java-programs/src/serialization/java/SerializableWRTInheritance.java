package serialization.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable {
	private static final long serialVersionUID = 1L;
	int i = 10;
	
}

class Bear extends Animal  {
	private static final long serialVersionUID = 1L;
	int j = 20;

}

public class SerializableWRTInheritance {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Bear bear1 = new Bear();
		
		System.out.println(bear1.i+"........"+bear1.j);
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(bear1);
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Bear bear2=(Bear)ois.readObject();
		System.out.println(bear2.i+"........"+bear2.j);
		
		oos.flush();
		oos.close();
		ois.close();
				
	}
}
