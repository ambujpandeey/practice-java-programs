package serialization.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Monkey implements Serializable {
	private static final long serialVersionUID = 1L;
	int age = 35;
	String name = "Mukesh";
}

class Dunkey implements Serializable {
	private static final long serialVersionUID = 1L;
	int age = 66;
	String name = "Sheetal";
}

public class DontNoOrderOfSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Monkey m1 = new Monkey();
		Dunkey d1 = new Dunkey();

		FileOutputStream fos = new FileOutputStream("PetAnimal.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(m1);
		oos.writeObject(d1);

		FileInputStream fis = new FileInputStream("PetAnimal.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		//Monkey m3 = (Monkey) ois.readObject();
		//Dunkey d3 = (Dunkey) ois.readObject();

		/*
		 * if (m3 != null || d3 != null) { System.out.println(m3.name +" "+ m3.age);
		 * System.out.println(d3.name +" "+ d3.age); m3 = (Monkey) ois.readObject(); d3
		 * = (Dunkey) ois.readObject(); } else {
		 * System.out.println("Something is wrong !!!"); }
		 */

		 if (o instanceof Dunkey) {
			Dunkey d2 = (Dunkey) o;
			System.err.println(d2.name + "  " + d2.age);
		}
		
		 else if (o instanceof Monkey) {
			Monkey m2 = (Monkey) o;
			System.err.println(m2.name + "  " + m2.age);
		} 
		

		oos.flush();
		oos.close();
		ois.close();
	}
}
