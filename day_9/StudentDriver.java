package day_9;

public class StudentDriver {
	public static void main(String[] args) {
//		Student s1 = new Student();
//		Student s2 = new Student();
//		s1.id = 12;
//		s1.name = "Samay";
//		s1.college_name = "Lovely University";
//		s1.marks = 70;
//		
//		System.out.println(s1.id+ " " +s1.name + " " +s1.college_name+" "+s1.marks);
//		System.out.println(s2.id+ " " +s2.name + " " +s2.college_name+" "+s2.marks);
//		s1.study();
		
		Student s1 = new Student(1, "Samay", "LPU", 70);
		System.out.println(s1.id+ " " +s1.name + " " +s1.college_name+" "+s1.marks);
	}
}
