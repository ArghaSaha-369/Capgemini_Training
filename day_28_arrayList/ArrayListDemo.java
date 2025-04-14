package day_28_arrayList;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		
		// add element
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		System.out.println(l1);
		
		// add all collection
		ArrayList list = new ArrayList(l1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(null);
		list.addAll(l1);
		list.add("Hello");
		System.out.println(list);
		System.out.println(list.size());
		
		// add element at a specific location
		l1.add(0, 75);
		System.out.println(l1);
		
		ArrayList l2 = new ArrayList<>();
		l2.add("Hello");
		l2.add("World");
		
		
		// add all collection at a specific index
		l1.addAll(1, l2);
		System.out.println(l1);
		
		//adding collection into another collection using add(
		l2.add(l1);
		System.out.println(l2);
		System.out.println(l2.size());
		
		//fetch element
		System.out.println(l1.get(2));
		System.out.println(l1.get(1));
		
		// clear all elements
		System.out.println(l2.size());
		l2.clear();
		System.out.println(l2.size());
		
		//remove element
		ArrayList l3 = new ArrayList<>();
		l3.add(10);
		l3.add("hello");
		l3.add('c');
		l3.add(null);
		
		System.out.println(l3.remove(null));
		System.out.println(l3.remove("hello"));
		
//		System.out.println(l3.remove(10)); //throws IndexOutOfBoundsException as 10 and character 'a' are implicitly callimg remove(index) rather than remove(Object)
		
	}
}
