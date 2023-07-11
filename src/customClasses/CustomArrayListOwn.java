package customClasses;

import java.util.Scanner;

public class CustomArrayListOwn {

	static int size = 4;
	static int array[] = new int[size];
	static int addedNo = 0;
	static int index = -1;

	// we need to increase array size by Arrays.copy() method
	public static void main(String[] args) {

		CustomArrayListOwn list = new CustomArrayListOwn();

		for (int i = 0; i < 10; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter some number..");
			int nextInt = scanner.nextInt();

			list.add(nextInt);
		}

		for (int no : array) {
			System.out.println(no);
		}
	}

	public static void add(int no) {
		if (index == -1) {
			index = 0;
			array[index] = no;
			addedNo++;
		} else {

			if (addedNo == size / 2) {
				size = size * 2;
			}

			array[++index] = no;
			addedNo++;
		}
	}

	@Override
	public String toString() {
		return "CustomArrayList [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
