package ExceptionHandler;

import java.util.Scanner;

class ToYoungException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	ToYoungException(String s) {
		super(s);
	}
}

class ToOldException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ToOldException(String s) {
		super(s);
	}
}

public class CustException {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter your age: ");
		int age = Integer.parseInt(s.nextLine());

		if (age < 18) {
			throw new ToYoungException("please wait some more time.... u will get best match");
		} else if (age > 60) {
			throw new ToOldException("u r age already crossed....no chance of getting married ");
		} else {
			System.out.println("Thankyou, you will get match details soon by e-mail");
		}
	}

}
