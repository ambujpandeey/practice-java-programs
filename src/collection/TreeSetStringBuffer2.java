package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetStringBuffer2 {

	public static void main(String[] args) {

		TreeSet<Object> ts = new TreeSet<>(new MyComparator5());
		ts.add(new StringBuffer("Ambuj"));
		ts.add("C");
		ts.add(new StringBuffer("Aman"));
		ts.add(new StringBuffer("Sheetal"));
		ts.add("XXXX");
		ts.add(new StringBuffer("Cat"));
		ts.add(new StringBuffer("Cat"));
		ts.add(new StringBuffer("Ambuj"));
		ts.add("AA");
		ts.add(new StringBuffer("Rat"));
		ts.add(new StringBuffer("Banana"));
		ts.add(new StringBuffer("Aman"));
		ts.add(new StringBuffer("Banana"));
		ts.add("HHHHHHH");

		System.out.println(ts);
	}
}

class MyComparator5 implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {

		String s1 = o1.toString();
		String s2 = o2.toString();

		int i1 = s1.length();
		int i2 = s2.length();

		if (i1 < i2) {
			return -1;
		} else if (i1 > i2) {
			return 1;
		}
		else {
			return s1.compareTo(s2);
			//return 0;
			//  If 2 Objects having Same Length then Consider their Alphabetical Order:
		}
	}
}

// Comparator ments for customized sorting
// when we implement comparator then must override compare()
