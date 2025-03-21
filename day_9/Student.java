package day_9;

public class Student {
	int id;
	String name;
	String college_name;
	double marks;
	
//	public Student(int x, String s1, String s2, double m) {
//		id = x;
//		name = s1;
//		college_name = s2;
//		marks = m;
//	}
	
	public Student () {
		System.out.println("This is a no-arg constructor");
	}
	
	public Student(int id) {
		this.id = id;
		System.out.println("This is a one-arg constructor");
	}
	
	public Student(int id, String name) {
		this(id);
		this.name = name;
		System.out.println("This is a two-arg constructor");
	}
	
	public Student(int id, String name, String college_name, double marks) {
		this(id, name);
		this.college_name = college_name;
		this.marks = marks;
		System.out.println("This is a four-arg constructor");
	}
	
//	public Student(int id, String name) {
//		this.id = id;
//		this.name = name;
//		System.out.println("This is a two-arg constructor");
//	}
//	
//	public Student(int id, String name, String college_name, double marks) {
//		this.id = id;
//		this.name = name;
//		this.college_name = college_name;
//		this.marks = marks;
//		System.out.println("This is a three-arg constructor");
//	}
	
	
	public void study() {
		System.out.println(name+" is studying hard");
	}
}
