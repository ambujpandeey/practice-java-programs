package practice.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSortDemo {
	public static void main(String args[]) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		/*
		 * al.add("Z"); al.add("A"); al.add("K"); al.add("N");
		 */

		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);

		System.out.println("Before Sorting:" + al); // Before Sorting:[Z, A, K, N]
		Collections.sort(al, new MyComparator());
		System.out.println("After Sorting:" + al); // After Sorting: [Z, N, K, A]
	}
}

class MyComparator implements Comparator<Object> {
	public int compare(Object obj1, Object obj2) {
		/*
		 * String s1 = (String) obj1; String s2 = obj2.toString();
		 */

		Integer s1 = (Integer) obj1;
		Integer s2 = (Integer) obj2;
		return s2.compareTo(s1);
	}
}
