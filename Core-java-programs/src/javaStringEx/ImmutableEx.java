package javaStringEx;

final public class ImmutableEx {
	private int i;
	public ImmutableEx(int i) {
		this.i = i;
	}

	private ImmutableEx modify(int j) {
		if (this.i == j) {
			return this;
		} else {
			return (new ImmutableEx(j));
		}
	}

	public static void main(String[] args) {

		ImmutableEx i1 = new ImmutableEx(10);
		ImmutableEx i2 = i1.modify(100);
		ImmutableEx i3 = i1.modify(10);

		System.out.println(i1 == i2);
		System.out.println(i1 == i3);
		System.out.println(i1.i + "-----" + i2.i);
		System.out.println(i1.i + "-----" + i3.i);
	}

}
