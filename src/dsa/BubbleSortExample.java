package dsa;

import java.util.Arrays;

public class BubbleSortExample {
	
/*	
	bubbleSort(array)
	  for i <- 1 to indexOfLastUnsortedElement-1
	    if leftElement > rightElement
	      swap leftElement and rightElement
	end bubbleSort
*/
	
	public static void main(String[] args) {

		int arr[] = { 1, 4, 88, 333, 45675, 334, 3, 5 };
		
		System.out.println("before Sorting...");
		System.out.println(Arrays.toString(arr));

		// calling defined method to sort
		BubbleSortExample.bubbleSort(arr);

		System.out.println("After Sorting...");
		System.out.println(Arrays.toString(arr));

	}

	static void bubbleSort(int arr[]) {
		// time complexity = 0(n^2)
		int length = arr.length;
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
