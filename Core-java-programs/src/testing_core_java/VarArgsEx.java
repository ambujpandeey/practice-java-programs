package testing_core_java;

public class VarArgsEx {

	static public void main(String... ask) {

		System.out.println("Parent main() method --> final, synchronized, strictfp and var-args");
	}
}

class Chek extends VarArgsEx {

	/*
	 * public static void main(String... ask) {
	 * System.out.println("Child main() method"); }
	 */

}
