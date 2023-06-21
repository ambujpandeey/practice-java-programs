package serializationJava;

import java.io.*;

class Login implements Serializable {
	private static final long serialVersionUID = 1L;
	String userName = "ShantaBai";
	transient String pwd = "Ambuj@017";
	transient int pin = 3614;

	// code for customize Serialization

	private void writeObject(ObjectOutputStream os) throws IOException {
		os.defaultWriteObject();
		String epwd = "Dont123" + pwd;
		int epin = 1234 + pin;
		os.writeObject(epwd);
		os.writeObject(epin);
	}

	private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException {
		is.defaultReadObject();
		String epwd = (String) is.readObject();
		int epin = (int) is.readObject();
		pwd = epwd.substring(7);
		pin = epin - 1234;
	}
}

public class CustomizedSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Login login = new Login();
		System.out.println("Customized Serialization Started...");
		System.out.println("Before Serialization...");
		System.out.println("userName = " + login.userName + " , pwd = " + login.pwd + ", pin = " + login.pin);

		FileOutputStream fos1 = new FileOutputStream("login.txt");
		ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
		oos1.writeObject(login);

		FileInputStream fis1 = new FileInputStream("login.txt");
		ObjectInputStream ois1 = new ObjectInputStream(fis1);
		Login logg = (Login) ois1.readObject();

		System.out.println("Customized Serialization End.");
		System.out.println("After Serialization.");
		System.out.println("userName = " + logg.userName + " , pwd = " + logg.pwd + ", pin = " + logg.pin);

		oos1.flush();
		oos1.close();
		ois1.close();
	}
}
