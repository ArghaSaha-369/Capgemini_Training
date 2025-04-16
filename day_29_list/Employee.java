package day_29_list;

public class Employee {
	int id;
	String name;
	
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return id+"  "+name;
	}
	
	public int toCampare(Object o) {
		return id - o.id;
	}
}
