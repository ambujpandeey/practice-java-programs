package java.core;

// Java Program to Convert Integer List to Integer Array

// Importing Arrays and List classes
// from java.util package
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// Main class
class GFG {

	// Main driver method
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 5, 7, 9, 34, 345, 56, 7, 2222);

//		int[] array = list.stream().mapToInt(i->i).toArray();
////		int[] array = list.stream().mapToInt(Integer::intValue).toArray();
//		
//		System.out.println(Arrays.toString(array));

		Set<Integer> mySet = new HashSet<Integer>(list);

		Set<Integer> mySet1 = new TreeSet<>(list);
//		mySet1.addAll(list);

		System.out.println(mySet);
		System.out.println("-----------------------------");
		System.out.println(mySet1);

	}
}
