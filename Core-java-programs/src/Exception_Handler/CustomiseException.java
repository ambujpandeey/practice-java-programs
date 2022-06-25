package Exception_Handler;

import java.util.Scanner;

class LessMarksException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	LessMarksException(String s) {
		super(s);
	}
}

class GoodMarksException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	GoodMarksException(String s) {
		super(s);
	}
}

class AverageMarksException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	AverageMarksException(String s) {
		super(s);
	}
}

public class CustomiseException {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter your marks : ");

		int marks = Integer.parseInt(s.nextLine());

		if (marks < 35) {
			throw new LessMarksException("Fail, got less marks");
		}
		
		else if(marks > 70) {
			throw new GoodMarksException("Pass with Distention");
		}
		else {
			throw new AverageMarksException("Pass, With Good Marks");
		}

	}

}
