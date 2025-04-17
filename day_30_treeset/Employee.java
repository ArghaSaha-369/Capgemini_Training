package day_30_treeset;

public class Employee implements Comparable<Employee>{
	String name;
	int salary;
	
	Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return (name+" "+salary);
	}
	
	public int compareTo(Employee e) {
		Employee e1 =(Employee)e;
		return this.salary - e.salary;
	}
}
