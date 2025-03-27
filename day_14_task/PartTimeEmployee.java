package day_14_task;

public class PartTimeEmployee extends Employee{
	private int workingHours;
	
	public PartTimeEmployee(String name, double salary, int workingHours) {
		super(name, salary);
		this.workingHours = workingHours;
	}
	
	public void employeeInfo() {
		super.employeeInfo();
		System.out.println(this.workingHours);
	}
	
	public void designation() {
		System.out.println("Designation: Senior Analyst");
	}
	
	public void jobRole() {
		System.out.println("Job Role : Cloud Engineer");
	}
}
