package day_23_circularSiglyLinkedList;

public class CircularSinglyLinkedList {
	Node head;
	Node tail;
	static int count;

	public void insert(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = node;
			count++;
		} else {
			tail.next = node;
			
		}
		tail = node;
		tail.next = head;
	}
	
	public void display() {
		if (head == null) {
			System.err.println("No data to display\n");
			return;
		} else {
			Node current = head;
			do {
				System.err.print(current.data + " ");
				current = current.next;
			}while (current != head);
			System.out.println();
		}
	}
	
	public void update(int position, int newData) {
		if (head == null) {
			System.out.println("List is empty");
		}
		if (position < 1 || position > count) {
			System.out.println("Invalid Position");
		}
		Node current = head;
		for(int i=1; i < position; i++) {
			current = current.next;
		}
		
		current.data = newData;
	}
	
	public void insertAt(int data, int position) {
		if(position < 1 || position > count + 1) {
			System.out.println("Invalid Position!");
			return;
		}
		Node node = new Node(data);
		
		if(position == 1) {
			if(head == null) {
				head = node;
				tail = node;
				node.next = head;
			}
			else {
				node.next = head;
				head = node;
				tail.next = head;
			}
		}
		else {
			Node current = head;
			for (int i =0; i<position -1; i++) {
				current = current.next;
			}
			node.next = current.next;
			current.next = node;
			if(current == tail) {
				tail = node;
			}
		}
		count++;
	}
	
	public void deleteAt(int position) {
		if (head == null) {
			System.out.println("No element to delete");
			return;
		}
		if (position < 1 || position > count) {
			System.out.println("Position out of bounds");
			return;
		}
		if (position == 1) {
			if(head == tail) {
				head = null;
				tail = null;
			}
			else {
				head = head.next;
				tail.next = head;
			}
		}
		else {
			Node current = head;
			for (int i = 1; i < position - 1; i++) {
				current = current.next;
			}
			Node toDelete = current.next;
			current.next = toDelete.next;
			
			if(toDelete == tail) {
				tail = current;
			}
		}
		count--;
	}
}
