package day_30_treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeDriver {
	public static void main(String[] args) {
		TreeSet<Employee> e = new TreeSet<Employee>();
		e.add(new Employee("Argha", 50000));
		e.add(new Employee("Kali", 40000));
		e.add(new Employee("Vikram", 60000));
		
//		System.out.println(e);
		System.out.println(e.descendingSet());
		
		Iterator<Employee> itr = e.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

