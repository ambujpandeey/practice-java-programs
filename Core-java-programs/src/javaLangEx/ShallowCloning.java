package javaLangEx;

class Lion {
	int j;

	public Lion(int j) {
		this.j = j;
	}
}

class Animal implements Cloneable {
	int i;
	Lion l;

	public Animal(Lion l, int i) {
		this.l = l;
		this.i = i;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		Lion l = new Lion(20);
		Animal a1 = new Animal(l, 10);

		System.out.println(a1.i + "---------" + a1.l.j);

		Animal a2 = (Animal) a1.clone();

		a1.i = 1000;
		a1.l.j = 2000;

		System.out.println(a2.i + "----------" + a2.l.j);
	}
}






