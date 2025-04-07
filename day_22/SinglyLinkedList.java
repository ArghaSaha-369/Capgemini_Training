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
		if(position < 0) {
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
}
