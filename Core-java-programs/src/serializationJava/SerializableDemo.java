package serializationJava;

import java.io.*;

class Cat implements Serializable {
	private static final long serialVersionUID = 1L;
	int i = 10;
	int j = 20;
	String name = "Shravan";
}

class Dog implements Serializable {
	private static final long serialVersionUID = 1L;
	int i = 30;
	int j = 40;
	String city = "Rewa";
}

class SerializableDemo {
	public static void main(String[] args) throws Exception {

		Lion cat = new Lion();
		Tiger dog = new Tiger();

		System.out.println("Serialization Started");
		FileOutputStream fos = new FileOutputStream("fileserial.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cat);
		oos.writeObject(dog);
		System.out.println("Serialization End");

		System.out.println("De-Serialization Started");

		FileInputStream fis = new FileInputStream("fileserial.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Lion cat2 = (Lion) ois.readObject();
		Tiger dog2 = (Tiger) ois.readObject();
		System.out.println("De-Serialization End");

		System.out.println(cat2.i + "   " + cat2.j + "   " + cat2.name);
		System.out.println(dog2.i + "   " + dog2.j + "   " + dog2.city);

		oos.flush();
		ois.close();
		oos.close();

	}
}
