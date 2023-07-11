package customClasses;

import java.util.Queue;
import java.util.Scanner;

public class CustomQue {

	static int arr[] = new int[8];
	static int top = -1;
	static int bottom = 0;

	public static void main(String[] args) {

		for (int i = 0; i < arr.length; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter some number..");
			int nextInt = scanner.nextInt();

			push(nextInt);

		}

		System.out.println("Pop operation..");

//		for (int i = 0; i < arr.length; i++) {
//
//			pop();
//		}
		while (bottom < 8) {

			pop();
		}

	}

	public static void push(int no) {
		if (top == -1) {
			top = 0;
			arr[top] = no;
		} else {
			arr[++top] = no;
		}
	}

	public static void pop() {
		if (top == -1) {
			System.out.println("stack is empty");
			return;
		} else {

			System.out.println(arr[bottom]);
			bottom++;
		}

	}

}
