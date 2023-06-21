package serializationJava;

import java.io.*;

public class SerialDeserialDemo implements Serializable {

	private static final long serialVersionUID = 1L;

	int id;
	String name;
	double marks;

	public SerialDeserialDemo(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException, EOFException {
		SerialDeserialDemo sd = new SerialDeserialDemo(101, "Ramakant", 93.20);
		SerialDeserialDemo sd1 = new SerialDeserialDemo(102, "Kamla", 89.66);
		SerialDeserialDemo sd2 = new SerialDeserialDemo(103, "Pujree", 34.55);
		SerialDeserialDemo sd3 = new SerialDeserialDemo(104, "Raja", 75.44);
		SerialDeserialDemo sd4 = new SerialDeserialDemo(105, "Ratnesh", 91);

		FileOutputStream fos = new FileOutputStream("xyz.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(sd);
		oos.writeObject(sd1);
		oos.writeObject(sd2);
		oos.writeObject(sd3);
		oos.writeObject(sd4);

		fos.flush();
		oos.flush();

		FileInputStream fis = new FileInputStream("xyz.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerialDeserialDemo sdd = (SerialDeserialDemo) ois.readObject();

		while (sdd != null) {
			try {
				System.out.println(sdd.id + " -- " + sdd.name + " -- " + sdd.marks);
				sdd = (SerialDeserialDemo) ois.readObject();
			} catch (Exception e) {
				// e.printStackTrace();
				break;
			}

		}

		oos.close();
		ois.close();

	}

}
