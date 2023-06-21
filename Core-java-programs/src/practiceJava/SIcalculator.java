package practiceJava;

import java.util.Scanner;

public class SIcalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");

		int no = sc.nextInt();

		if (no % 400 == 0) {
			System.out.println(no + " Leap Year");
		} else if (no % 100 == 0) {
			System.out.println(no + " Not Leap Year");
		} else if (no % 4 == 0) {
			System.out.println(no + " Leap Year");
		} else {
			System.out.println(no + " Not Leap Year");
		}

		/*
		 * if (no % 2 == 0) { System.out.println("Even Number"); } else {
		 * System.out.println("Odd Number"); }
		 */

		/*
		 * int n = Integer.parseInt(sc.nextLine());
		 * 
		 * if (n > 0) { System.out.println("Positive Number"); } else {
		 * System.out.println("Negative Number"); }
		 */

	}
}
