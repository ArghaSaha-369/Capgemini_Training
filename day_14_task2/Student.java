package day_14_task2;

public class Student extends Person {
	private int studentId;

	Student(String name, int age, int studentId) {
		super(name, age);
		this.studentId = studentId;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println(" " + this.studentId);
	}
}
