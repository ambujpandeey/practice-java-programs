package dsa;

public class MergeSortExample {

	public static void main(String[] args) {
		
		
		int array[] = { 3, 5, 8, 9, 1, 2, 4, 6, 7, 0 };

		mergeSort(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	private static void mergeSort(int[] array) {

		int length = array.length;
		if (length <= 1)
			return;// base case

		int middle = length / 2; // middle length
		// empty array to store recursion array
		int leftArray[] = new int[middle];
		int rightArray[] = new int[length - middle];

		int i = 0; // left array
		int j = 0; // right array

		// loop for recursion concept
		for (; i < length; i++) {
			if (i < middle) {
				leftArray[i] = array[i];
			} else {
				rightArray[j] = array[i];
				j++;
			}
		}

		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(array, leftArray, rightArray);
	}

	static void merge(int array[], int leftArray[], int rightArray[]) {

		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;

		int i = 0, l = 0, r = 0;

		// check the condition for the merging
		while (l < leftSize && r < rightSize) {
			if (leftArray[l] < array[r]) {
				array[i] = leftArray[l];
				i++;
				l++;
			} else {
				array[i] = rightArray[r];
				i++;
				r++;
			}
		}

		while (l < leftSize) {
			array[i] = leftArray[l];
			i++;
			l++;
		}
		while (r < rightSize) {
			array[i] = rightArray[r];
			i++;
			r++;
		}
	}
}
