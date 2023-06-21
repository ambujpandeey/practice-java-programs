package maps;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapCustomized {
	public static void main(String[] args) {
		TreeMap<Object, Object> t1 = new TreeMap<>(new MyComparator());
		t1.put(111, "Santosh");
		t1.put(343, "kamlesh");
		t1.put(2445, "pavan");
		t1.put(8796, "ambuj");
		t1.put(6453, "kantabai");
		t1.put("nokia", "vivek");
		t1.put("asus", "vivek");
		t1.put("samsung", "vivek");
		t1.put("redmi", "vivek");
		System.out.println(t1);
	}
}

class MyComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();		
		//return s1.compareTo(s2);
		//return -s1.compareTo(s2);
		return s2.compareTo(s1);
		//return -s2.compareTo(s1);
	}
	
}