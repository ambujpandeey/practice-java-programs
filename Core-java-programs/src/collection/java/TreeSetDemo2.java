package collection.java;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {

		TreeSet<Object> ts = new TreeSet<>(new MyComparator2());
		ts.add("Ambuj");
		ts.add("Aman");
		ts.add("Sheetal");
		ts.add("Banana");
		ts.add("Cat");
		ts.add("Rat");
		ts.add("Ambuj");
		ts.add("Sheetal");
		ts.add("Cat");
		System.out.println(ts);		
	}
}

class MyComparator2 implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		
		String s1 = o1.toString();
		String s2 = (String) o2;
		
		//return s1.compareTo(s2);
		return -s1.compareTo(s2);
	}
}


// Comparator ments for customized sorting
// when we implement comparator then must override compare()

