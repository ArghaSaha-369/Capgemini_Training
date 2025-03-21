package day_9;

public class Student {
	int id;
	String name;
	String college_name;
	double marks;
	
	public Student(int x, String s1, String s2, double m) {
		id = x;
		name = s1;
		college_name = s2;
		marks = m;
	}
	
	public void study() {
		System.out.println(name+" is studying hard");
	}
}
