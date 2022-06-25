package practice.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringArray {	
		
	public static void main(String[] args) {
		
		String[] inputArray = {"India", "Japan", "Bombey", "Delhi"};
		System.out.println("Before reverse : " + Arrays.toString(inputArray));
		reverse(inputArray);
	}

	private static void reverse(String[] inputArray) {
		List<String> list = Arrays.asList(inputArray);
		Collections.reverse(list);
		String[] reverseArray = list.toArray(inputArray);
		System.out.println("After reverse : "+Arrays.toString(reverseArray));
	}
}
