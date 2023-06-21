package genericsJava;

class General<T> {
	T obj;

	public General(T obj) {
		this.obj = obj;
	}

	public void show() {
		System.out.println("The type of obj is : " + obj.getClass().getName());

	}

	public T getObject() {
		return obj;
	}
}

public class Generics {

	public static void main(String[] args) {
		General<String> g1 = new General<String>("Ambuj");
		g1.show();
		System.out.println(g1.getObject());

		General<Integer> g2 = new General<Integer>(12);
		g2.show();
		System.out.println(g2.getObject());

		General<Double> g3 = new General<Double>(566.767);
		g3.show();
		System.out.println(g3.getObject());
	}

}
