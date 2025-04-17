package day_30_hashSet;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		
		h.add(10);
		h.add("Hello");
		h.add(true);
		h.add(10.65);
		h.add(true);
		h.add(null);
		h.add(null);
		
		System.out.println(h);
	}
}
