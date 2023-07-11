package dsa;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = { 4, 6, 7, 22, 445, 1, 10 };

		// selection sort
		// time complexity = 0(n^2)
		for (int i = 0; i < arr.length - 1; i++) {

			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}

			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}

		printSelectionSortArray(arr);
	}

	public static void printSelectionSortArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
