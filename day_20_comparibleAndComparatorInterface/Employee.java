package day_20_comparibleAndComparatorInterface;

public class Employee implements Comparable{
	private int id;
	private String name;
	private double salary;
	
	Employee(int id, String name, double salary){
		this.setId(id);
		this.name= name;
		this.salary = salary;
	}
	
	public String toString() {
		return getId()+" "+name+" "+salary;
	}
	
//	@Override
//	public int compareTo(Object o) {
//		Employee e = (Employee)o;
//		return (int)(this.salary -  e.salary);
//	}
	
	
	//Overriding the String
	@Override
	public int compareTo(Object o) {
		Employee e = (Employee)o;
		return this.name.compareTo(e.name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
