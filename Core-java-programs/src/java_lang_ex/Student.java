package java_lang_ex;

public class Student {
	String name;
	int rollno;

	Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
	public String toString() {
		return name+"...."+rollno;
	}
	public static void main(String args[]) {
		Student s1 = new Student("saicharan", 101);
		Student s2 = new Student("ashok", 102);
		System.out.println(s1.name+"  "+s1.rollno);
		System.out.println(s1.toString());
		System.out.println(s2);
	}
}