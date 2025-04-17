package day_30_hashSet;

import java.util.HashSet;

public class StudentDriver {
	public static void main(String[] args) {
		HashSet<Student> h = new HashSet<>();
		h.add(new Student(1, "Argha"));
		h.add(new Student(2, "Amlan"));
		h.add(new Student(3, "Avishek"));
		h.add(new Student(4, "Adarsh"));
		h.add(new Student(1, "Argha"));
		
		System.out.println(h);
		
		
	}
}
