package day_35_fileHandling;

import java.io.Serializable;

public class Employee implements Serializable{
	
	String name;
	int id;
	double salary;
	
	Employee(String name, int id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return name+" "+id+" "+salary;
	}
	
}
