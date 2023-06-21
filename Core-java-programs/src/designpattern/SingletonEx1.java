package designpattern;


public class SingletonEx1 {

	private static SingletonEx1 instance;

	private SingletonEx1() {

	}

	// Lazy way of creating Singleton Object
	public static SingletonEx1 instance() {
		if (instance == null) {
			//if multiple Thread calling instance() at same time then 4 object will create 
			// so overcome this problem we need synchronized way to create object
			synchronized (SingletonEx1.class) {
				if (instance == null) {
					instance = new SingletonEx1();
				}
			}
		}

		return instance;
	}

	// 1. make constructor private
	// 2. Object create with the help of method
	// 3. create field to store object is private  
	
	
}
