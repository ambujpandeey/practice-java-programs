package dsa;

import java.util.Arrays;

public class InsertionSortExample {
	public static void main(String[] args) {
		int arr[] = { 15, 88, 4, 333, 45675, 334, 3, 5 };

		System.out.println("before Sorting...");
		System.out.println(Arrays.toString(arr));

		InsertionSortExample.insertionSort(arr);

		System.out.println("\nAfter Sorting...ASC	");
		System.out.println(Arrays.toString(arr));
	}

	static void insertionSort(int arr[]) {
		int length = arr.length;

		for (int i = 1; i < length; i++) {

			int key = arr[i];
			int j = i - 1;

			// Compare key with each element on the left of it, until an element smaller than it is found.
			// For descending order, change key<array[j] to key>array[j].
			while (j >= 0 && key < arr[j]) {

				arr[j + 1] = arr[j];
				--j;
			}

			// Place key at after the element just smaller than it.
			arr[j + 1] = key;

		}
	}

}
