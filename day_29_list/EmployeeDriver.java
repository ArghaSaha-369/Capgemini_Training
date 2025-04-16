package day_29_list;

import java.util.*;

public class EmployeeDriver {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList();
		employees.add(new Employee(1, "Argha"));
		employees.add(new Employee(2, "Swas"));
		employees.add(new Employee(2, "Pratyusha"));
		
		for(Employee e : employees) {
			System.out.println(e);
		}
		
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(50);
		a1.add(30);
		a1.add(20);
		a1.add(90);
		
		
		//ConcurrentModificationException is created for manipulating the iterating arraylist
		// break is used to avoid it after manipulating the arraylist
//		for (int i : a1) {
//			if (i == 30) {
//				Integer x = i;
//				a1.remove(x);
//				break;
//			}
//		}
		
		// Iterator
		Iterator<Integer> itr = a1.iterator();
		while(itr.hasNext()) {
			int x = itr.next();
			if(x==30) {
				itr.remove();
			}
		}
		System.out.println(a1);
		
		Iterator<Employee> itr2 = employees.iterator();
		while (itr2.hasNext()) {
			Employee e = itr2.next();
			if(e.name.equals("Pratyusha")) {
				itr2.remove();
			}
		}
		System.out.println(employees);
		
		// ListIterator
		ListIterator list = a1.listIterator();
		//travelling in forward direction
		while(list.hasNext()) {
			System.out.println("Index: "+list.nextIndex()+"   "+ "Element: "+list.next());
		}
		
		// reseting the cursor back to first position
		while(list.hasPrevious()) {
			list.previous();
		}
		
		System.out.println("-------------------");
		
		while(list.hasNext()) {
			int index = list.nextIndex();
			if(index==1) {
				list.add(50);
			}
			int element = (Integer)list.next();
			
			if(element == 50) {
				list.set(100);
			}
		}
		
		System.out.println(a1);
		
		System.out.println("------------ ------");
		
//		ArrayList a2 = new ArrayList<>();
//		a2.add(10);
//		a2.add(10.56);
//		a2.add('c');
//		a2.add(true);
//		
//		Collections.sort(a2);
		// Sorting based on id using Comparable
		Collections.sort(employees);
		System.out.println(employees);
		
		// Sorting based on name using comparator
		Collections.sort(employees, new CompareByName());
		System.out.println(employees);
	}
}
