package javaLangEx;

class Cat {
	int j;

	public Cat(int j) {
		this.j = j;
	}
}

class Dog implements Cloneable {
	Cat c;
	int i;

	public Dog(Cat c, int i) {
		this.i = i;
		this.c = c;
	}

	public Object clone() throws CloneNotSupportedException {
		// for Deep cloning
		Cat c1 = new Cat(c.j);
		Dog d1 = new Dog(c1, i);
		return d1;

		// for Shallow cloning
		// return super.clone();
	}
}

public class DeepCloning implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {

		Cat c = new Cat(20);
		Dog d1 = new Dog(c, 10);
		System.out.println(d1.i + "..............." + d1.c.j);

		Dog d2 = (Dog) d1.clone();

		d1.i = 888;
		d1.c.j = 999;

		System.out.println(d2.i + "..............." + d2.c.j);
	}
}
