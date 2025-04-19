package day_31_lambdaExpressions;

public class Employee implements Comparable{
	int id;
	String name;
	
	Employee (int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return this.id + "  " + this.name;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return (int);
	}
}