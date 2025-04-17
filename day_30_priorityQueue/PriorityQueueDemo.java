package day_30_priorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue();
		p.add(10);
	//	p.add(null); //NullPointerException
		p.add(20);
		p.add(30);
		p.add(40);
		
		System.out.println(p);
	}
}
