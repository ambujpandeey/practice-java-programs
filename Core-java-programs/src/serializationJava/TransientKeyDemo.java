package serializationJava;

import java.io.*;

class Lion implements Serializable {
	private static final long serialVersionUID = 1L;

	int i = 10;
	transient int h = 70; // use full, place 0
	final int j = 20;
	transient final int k = 20; // no use
	static int l = 50;
	transient static int m = 60; // no use

	String name = "Kartik";
}

class Tiger implements Serializable {
	private static final long serialVersionUID = 1L;
	int i = 30;
	transient int j = 40;
	String city = "Bhopal";
}

public class TransientKeyDemo {
	public static void main(String[] args) throws Exception {

		Lion lion = new Lion();
		Tiger tiger = new Tiger();

		System.out.println("Serialization Started");
		FileOutputStream fos = new FileOutputStream("transientfile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(lion);
		oos.writeObject(tiger);
		System.out.println("Serialization End");

		System.out.println("De-Serialization Started");

		FileInputStream fis = new FileInputStream("transientfile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Lion lion2 = (Lion) ois.readObject();
		Tiger tiger2 = (Tiger) ois.readObject();
		System.out.println("De-Serialization End");

		System.out.println("h =" + lion2.h + "  " + "i =" + lion2.i + "  " + "j =" + lion2.j + "  " + "k =" + lion2.k
				+ "  " + "l =" + Lion.l + "  " + "m =" + Lion.m + "  " + "Name=" + lion2.name);
		System.out.println(tiger2.i + "   " + tiger2.j + "   " + tiger2.city);

		oos.flush();
		ois.close();
		oos.close();

	}
}
