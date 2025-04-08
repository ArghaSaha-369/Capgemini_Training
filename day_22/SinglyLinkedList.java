package day_22;

public class SinglyLinkedList {
	Node head;
	Node tail;
	static int count;

	public void insert(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = node;
			tail = node;
			count++;
		} else {
			tail.next = node;
			tail = node;
			count++;
		}
	}

	public void display() {
		if (head == null) {
			System.err.println("No data to display\n");
			return;
		} else {
			Node current = head;
			while (current != null) {
				System.err.println(current.data);
				current = current.next;
			}
			System.out.println();
		}
	}

	public void update(int position, int newData) {
		if (head == null) {
			System.out.println("List is empty");
		}
		if (position < 0) {
			System.out.println("Invalid Position");
		}
		Node current = head;
		int currentPosition = 0;

		while (current != null && currentPosition < position) {
			current = current.next;
			currentPosition++;
		}
		current.data = newData;
	}

	public void insertAt(int data, int position) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
			count++;
			return;
		}
		if (position == 1) {

			node.next = head;
			head = node;
			count++;
			return;
		}
		Node current = head;
		for (int i = 1; i <= count; i++) {
			if (i == position - 1) {
				node.next = current.next;
				current.next = node = current;
				count++;
				return;
			}
			current = current.next;
		}
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
			Node temp = head;
			head = head.next;
			temp.next = null;
			count--;
			return;
		}
		Node current = head;
		if (position == count) {
			for (int i = 1; i <= count; i++) {
				if (i == position - 1) {
					current.next = null;
					count--;
					return;
				}
				current = current.next;
			}
		}
		for(int i=0; i<=count;i++) {
			if(i==position) {
				Node temp = current;
				current =current.next;
				temp.next = current.next;
				current.next = null;
				count--;
			}
			current = current.next;
		}
	}
}
