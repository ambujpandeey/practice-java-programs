package dsa;

public class InsertionSort {

	public static void main(String[] args) {

		int array[] = { 7, 6, 8, 3, 699, 356, 4 };

		// we break array in two part , SORTED | UNSORTED
		for (int i = 1; i < array.length; i++) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && key < array[j]) {
				array[j + 1] = array[j];
				--j;
			}
			array[j + 1] = key;
		}
		printInsertionArray(array);
	}

	private static void printInsertionArray(int array[]) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
