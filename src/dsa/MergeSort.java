package dsa;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 9, 3, 2, 7, 1, 5, 6, 8, 4 };
		
		mergeSort(arr, 0, arr.length - 1);
		
		System.out.println("Sorted array:");
		
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	public static void mergeSort(int[] arr, int low, int high) {
	
		if (low < high) {
//			int mid = (low + high) / 2;
			int mid = low + (high - low) / 2;

			// Recursively sort the two halves
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);

			// Merge the sorted halves
			merge(arr, low, mid, high);
		}
	}

	public static void merge(int[] arr, int low, int mid, int high) {
		
		int leftLength = mid - low + 1;
		int rightLength = high - mid;

		// Create temporary arrays for the left and right halves
		int[] leftArray = new int[leftLength];
		int[] rightArray = new int[rightLength];

		// Copy elements from the original array to the temporary arrays
		for (int i = 0; i < leftLength; i++) {
			leftArray[i] = arr[low + i];
		}
		for (int j = 0; j < rightLength; j++) {
			rightArray[j] = arr[mid + 1 + j];
		}

		// Merge the two temporary arrays back into the original array
		int i = 0, j = 0, k = low;
		while (i < leftLength && j < rightLength) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements from the leftArray, if any
		while (i < leftLength) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		// Copy remaining elements from the rightArray, if any
		while (j < rightLength) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}
}
