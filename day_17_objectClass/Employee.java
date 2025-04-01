package day_17_objectClass;

public class Employee implements Cloneable{
	private int id;
	private double salary;
	private String name;

	public Employee(int id, double salary, String name) {
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

//	public String toString() {
//		return (this.id+" "+this.salary+" "+this.name);
//	}

	public boolean equals(Object o) {
		if (o instanceof Employee) {
			Employee e = (Employee) o;
			return this.id == e.id && this.salary == e.salary && this.name.equals(e.name);
		}
		return false;
	}
	
	public int hashCode() {
		return (int) (this.id+this.salary+this.name.hashCode());
	}
	

}
