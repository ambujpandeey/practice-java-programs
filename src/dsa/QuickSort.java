package dsa;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 9, 3, 2, 7, 1, 5, 6, 8, 4 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println("Sorted array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			// Partition the array into two halves
			int pivotIndex = partition(arr, low, high);

			// Recursively sort the two halves
			quickSort(arr, low, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	public static int partition(int[] arr, int low, int high) {
		// Choose the rightmost element as the pivot
		int pivot = arr[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			// If current element is smaller than or equal to pivot
			if (arr[j] <= pivot) {
				i++;

				// Swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// Swap arr[i+1] and arr[high] (or the pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}
}
