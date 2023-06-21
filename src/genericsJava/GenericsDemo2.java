package genericsJava;

class Gen1<T> {

	T obj;

	Gen1(T obj) {
		this.obj = obj;
	}

	/*
	 * public void show() { System.out.println("The type of object is : " +
	 * obj.getClass().getName()); }
	 * 
	 * public T getObject() { return obj; }
	 */

}

public class GenericsDemo2 {
	public static void main(String[] args) {

		Gen<String> g1 = new Gen<String>("Akanksha");
		g1.show();
		//System.out.println(g1.getObject());
		System.out.println(g1.obj);

		Gen<Integer> g2 = new Gen<Integer>(35435);
		g2.show();
		//System.out.println(g2.getObject());
		System.out.println(g2.obj);

		Gen<Double> g3 = new Gen<Double>(34.44);
		g3.show();
		//System.out.println(g3.getObject());
		System.out.println(g3.obj);

	}
}
