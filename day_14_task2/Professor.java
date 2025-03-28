package day_14_task2;

public class Professor extends Person {
	private String specialization;

	Professor(String name, int age, String specialization) {
		super(name, age);
		this.specialization = specialization;
	}

	public void displayiota() {
		super.displayInfo();
		System.out.println(" " + this.specialization);
	}
}