package day_23_doublyLinkedList;

public class DoublyLinkedList {
	Node head;
	Node tail;
	int count;
	
	public void insert(int data) {
		Node node = new Node(data);
		
		if (head == null) {
			head = node;
			tail = node;
		}
		else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
		count++;
	}
	
	public void display() {
		if (head == null) {
			System.out.println("List is Empty");
		}
		
		Node current = head;
		System.out.println("Forward:");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
		displayBackward();
	}
	
	public void displayBackward() {
		if (tail == null) {
			System.out.println("List is Empty");
		}
		
		Node current = tail;
		System.out.println("Backward:");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.prev;
		}
		System.out.println();
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
				 
			}
			else {
				node.next = head;
				head.prev = node;
				head = node;
			}
		}
		else if (position == count + 1){
			tail.next = node;
			node.prev =tail;
			tail = node;
		}
		else {
			Node current = head;
			for (int i =1; i<position -1; i++) {
				current = current.next;
			}
			node.next = current.next;
			node.prev = current;
			current.next.prev = node;
			current.next = node;
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
				head.prev = null;
			}
		}
		else if(position == count) {
			tail = tail.prev;
			tail.next = null;
		}
		
		else {
			Node current = head;
			for (int i = 1; i < position; i++) {
				current = current.next;
			}
			current.prev.next = current.next;
			current.next.prev = current.prev;
		}
		count--;
	}
}
