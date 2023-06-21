package javaLangEx;

public class EqualsMethod {
	String name;
	int rollno;

	EqualsMethod(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	/*
	 * public boolean equals(Object o) {
	 * 
	 * if (this.name == o) return true;
	 * 
	 * if (o instanceof EqualsMethod) { EqualsMethod em1 = (EqualsMethod) o; if
	 * (name.equals(em1.name) && (rollno == em1.rollno)) { return true; } else {
	 * return false; } } return false; }
	 */
	
	public boolean equals(Object o) {
		try {
			EqualsMethod em1 = (EqualsMethod) o;
			if (name.equals(em1.name) && (rollno == em1.rollno)) {
				return true;
			} else {
				return false;
			}
		} catch (ClassCastException e) {
			return false;
		} catch ( NullPointerException e) {
			return false;
		}	
	}
	
	public static void main(String[] args) {
		EqualsMethod em1 = new EqualsMethod("rajesh", 101);
		EqualsMethod em2 = new EqualsMethod("rajesh", 101);
		EqualsMethod em3 = new EqualsMethod("kamal", 105);
		EqualsMethod em4 = em1;
		
		System.out.println(em1 == em2);  // false
		System.out.println(em1 == em3);  // false
		System.out.println(em1 == em4);  // true
		System.out.println(em1.equals(em4));  // true
				
		System.out.println(em1.equals(em2));  // true
		System.out.println(em1.equals(em3));  // false
	}
}
