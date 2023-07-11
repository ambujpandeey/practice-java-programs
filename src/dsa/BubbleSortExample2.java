package dsa;

import java.util.Arrays;

//Optimized Bubble sort in Java

/*
bubbleSort(array)
  swapped <- false
  for i <- 1 to indexOfLastUnsortedElement-1
    if leftElement > rightElement
      swap leftElement and rightElement
      swapped <- true
end bubbleSort 
*/


class BubbleSortExample2 {
	
	public static void main(String args[]) {

		int[] data = { -2, 45, 0, 11, -9 };
		
		System.out.println("Before Sorting : ");
		System.out.println(Arrays.toString(data));

		// call method using the class name
		BubbleSortExample2.bubbleSort(data);

		System.out.println("\nAfter Sorting : ASC");
		System.out.println(Arrays.toString(data));
	}
	

// perform the bubble sort
	static void bubbleSort(int array[]) {
		int size = array.length;

		// loop to access each array element
		for (int i = 0; i < (size - 1); i++) {

			// check if swapping occurs
			boolean swapped = false;

			// loop to compare adjacent elements
			for (int j = 0; j < (size - i - 1); j++) {

				// compare two array elements
				// change > to < to sort in descending order
				if (array[j] > array[j + 1]) {

					// swapping occurs if elements are not in the intended order
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

					swapped = true;
				}
			}
			// no swapping means the array is already sorted
			// so no need for further comparison
			if (!swapped)
				break;
		}
	}


}