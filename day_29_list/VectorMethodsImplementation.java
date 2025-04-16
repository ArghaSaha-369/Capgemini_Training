package day_29_list;

import java.util.Stack;

public class VectorMethodsImplementation {
	public static void main(String[] args) {
		Stack s1 = new Stack();
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		System.out.println(s1);
		
		Stack s2 = new Stack();
		
		s2.push(10);
		s2.push(20);
		s2.push(30);
		System.out.println(s2);
		
		System.out.println(s2.search(10));	
		System.out.println(s2.search(30));
		System.out.println("----------------------------");
		System.out.println(s1.search(10));	
		System.out.println(s1.search(30));
		System.out.println("----------------------------");
		System.out.println(s1.get(0));
		System.out.println(s2.get(0));
		
	}
}
