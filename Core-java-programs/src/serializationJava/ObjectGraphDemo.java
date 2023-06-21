package serializationJava;

import java.io.*;

class Catt implements Serializable {
	private static final long serialVersionUID = 1L;
	Dogg dog = new Dogg();
}

class Dogg implements Serializable {
	private static final long serialVersionUID = 1L;
	Ratt rat = new Ratt();
}

class Ratt implements Serializable {
	private static final long serialVersionUID = 1L;
	int i = 100;
}

public class ObjectGraphDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Catt cat = new Catt();
		FileOutputStream fos1 = new FileOutputStream("objectgraph.txt");
		ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
		oos1.writeObject(cat);

		FileInputStream fis1 = new FileInputStream("objectgraph.txt");
		ObjectInputStream ois1 = new ObjectInputStream(fis1);
		Catt cat2 = (Catt) ois1.readObject();

		System.out.println(cat2.dog.rat.i);
		oos1.flush();
		oos1.close();
		ois1.close();
	}
}
