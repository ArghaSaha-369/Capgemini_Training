package day_9;

public class Employee {
	int id;
	String name;
	long salary;
	String company;
	
	public Employee() {
		System.out.println("No Argument Found");
	}
	
	public Employee(int id) {
		this.id = id;
	}
	
	public Employee(int id, String name) {
		this(id);
		this.name = name;
	}
	
	public Employee(int id, String name, long salary) {
		this(id, name);
		this.salary = salary;
	}
	
	public Employee(int id, String name, long salary, String company) {
		this(id, name, salary);
		this.company = company;
	}
}
