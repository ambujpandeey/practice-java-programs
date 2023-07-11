package dsa;

import java.util.Arrays;

public class SelectionSortExample {

	public static void main(String[] args) {
		int array[] = { 55, 232, 1, 11, 6, 7, 9, 33 };

		System.out.println("Before Sorting....");
		System.out.println(Arrays.toString(array));

		SelectionSortExample.selectionSort(array);

		System.out.println("\nAfter Sorting....DESC");
		System.out.println(Arrays.toString(array));

	}

	static void selectionSort(int array[]) {

		for (int i = 0; i < array.length - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[smallest] < array[j]) {
					smallest = j;
				}
			}
			int temp = array[smallest];
			array[smallest] = array[i];
			array[i] = temp;
		}
	}
}
