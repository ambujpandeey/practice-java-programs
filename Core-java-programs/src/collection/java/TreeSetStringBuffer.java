package collection.java;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetStringBuffer {

	public static void main(String[] args) {

		TreeSet<Object> ts = new TreeSet<>(new MyComparator4());
		ts.add(new StringBuffer("Ambuj"));
		ts.add(new StringBuffer("Aman"));
		ts.add(new StringBuffer("Sheetal"));
		ts.add(new StringBuffer("Cat"));
		ts.add(new StringBuffer("Cat"));
		ts.add(new StringBuffer("Ambuj"));
		ts.add(new StringBuffer("Rat"));
		ts.add(new StringBuffer("Banana"));
		ts.add(new StringBuffer("Aman"));
		ts.add(new StringBuffer("Banana"));		
		System.out.println(ts);
	}
}

class MyComparator4 implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {

		String s1 = o1.toString();
		String s2 = o2.toString();
		
		return -s1.compareTo(s2);
	}
}

// Comparator ments for customized sorting
// when we implement comparator then must override compare()
