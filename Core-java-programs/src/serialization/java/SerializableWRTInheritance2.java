package serialization.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animals {
	int i = 100;

	public Animals() {
		System.out.println("Animal constructor called...");
	}
}

class Dear extends Animals implements Serializable {
	private static final long serialVersionUID = 1L;
	int j = 200;

	public Dear() {
		System.out.println("Dear constructor called...");
	}
}

public class SerializableWRTInheritance2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Dear dear1 = new Dear();
		dear1.i = 888;
		dear1.j = 999;

		System.out.println("Serialization Started...");
		System.out.println(dear1.i + "........" + dear1.j);
		FileOutputStream fos = new FileOutputStream("SerializeInher.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(dear1);
		FileInputStream fis = new FileInputStream("SerializeInher.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dear dear2 = (Dear) ois.readObject();
		
		System.out.println("De-Serialization Started...");
		System.out.println(dear2.i + "........" + dear2.j);

		oos.flush();
		oos.close();
		ois.close();

	}
}
