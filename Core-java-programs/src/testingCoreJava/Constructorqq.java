package testingCoreJava;

class Student{
	 int id;
	 String name;
	 String name1;
	 String name12;
	 public Student() {
		System.out.println("Student class Applied");
	} 
	 
	public Student(int id, String name, String name1) {
		this.id = id;
		this.name = name;
		this.name1 = name1;
	}

	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	 
	 
}

public class Constructorqq {
	public static void main(String[] args) {
		Student student  = new Student(12,"Raunak","jtyjty"); 
		
		System.out.println(student.id);
		System.out.println(student.name);
		
		System.out.println("------------------by setter  getter");
		
		Student S2 = new Student();
		student.setId(2342);
		student.setName("Kamal Hasan");
		
		System.out.println(student.getId());
		System.out.println(student.getName());
		
		
	}
	
	
}


