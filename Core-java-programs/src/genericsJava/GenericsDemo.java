package genericsJava;

class Gen<T> {

	T obj;

	Gen(T obj) {
		this.obj = obj;
	}

	public void show() {
		System.out.println("The type of object is : " + obj.getClass().getName());
	}

	public T getObject() {
		return obj;
	}

}

public class GenericsDemo {
	public static void main(String[] args) {

		Gen<String> g1 = new Gen<String>("Akshay");
		g1.show();
		System.out.println(g1.getObject());

		Gen<Integer> g2 = new Gen<Integer>(12);
		g2.show();
		System.out.println(g2.getObject());

		Gen<Double> g3 = new Gen<Double>(12.44);
		g3.show();
		System.out.println(g3.getObject());
		//System.out.println(g3.obj);

	}
}
