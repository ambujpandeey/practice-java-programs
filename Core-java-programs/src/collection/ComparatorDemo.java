package collection;

import java.util.Comparator;
import java.util.TreeSet;

class Student implements Comparable<Object> {
	int sid;
	String name;

	Student(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}

	@Override
	public String toString() {
		return sid + " ----> " + name;
	}

	@Override
	public int compareTo(Object obj) {
		int sid1 = this.sid;
		Student s = (Student) obj;
		int sid2 = s.sid;

		if (sid1 < sid2) {
			return -1;
		} else if (sid1 > sid2) {
			return 1;
		} else {
			return 0;
		}
	}
}

public class ComparatorDemo {
	public static void main(String[] args) {
		Student s1 = new Student(101, "rakesh");
		Student s2 = new Student(105, "manish");
		Student s3 = new Student(103, "komal");
		Student s4 = new Student(102, "prateek");
		Student s7 = new Student(102, "prateek");
		Student s5 = new Student(106, "aman");
		Student s6 = new Student(104, "vinay");
		Student s8 = new Student(104, "vinay");

		TreeSet<Student> t1 = new TreeSet<>();
		t1.add(s3);
		t1.add(s1);
		t1.add(s4);
		t1.add(s2);
		t1.add(s6);
		t1.add(s5);
		t1.add(s8);
		t1.add(s7);
		System.out.println(t1);

		TreeSet<Student> t2 = new TreeSet<>(new Comparator1());
		t2.add(s3);
		t2.add(s1);
		t2.add(s4);
		t2.add(s2);
		t2.add(s7);
		t2.add(s6);
		t2.add(s5);
		t2.add(s8);
		System.out.println(t2);
	}
}

class Comparator1 implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {

		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		String string1 = s1.name;
		String string2 = s2.name;
		
		return string1.compareTo(string2);
	}
}


