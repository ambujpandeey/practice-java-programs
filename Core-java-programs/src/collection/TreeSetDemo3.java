package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {

		TreeSet<Object> ts = new TreeSet<>(new MyComparator3());
		ts.add(10);
		ts.add(20);
		ts.add(0);
		ts.add(15);
		ts.add(5);
		ts.add(45);
		ts.add(45);
		ts.add(0);
		ts.add(56);
		System.out.println(ts);
	}
}

class MyComparator3 implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {

		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		
	//	return i1.compareTo(i2);
		return -i1.compareTo(i2);
	//	return i2.compareTo(i1);
	//	return -i2.compareTo(i1);
	//  return 0;
		
	}
}


// Comparator ments for customized sorting
// when we implement comparator then must override compare()

