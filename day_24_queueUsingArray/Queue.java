package day_24_queueUsingArray;

public class Queue {
	private int arr[];
	private int start, end, currSize, maxSize;

	public Queue() {
		arr = new int[16];
		start = -1;
		end = -1;
		currSize = 0;
	}

	public Queue(int maxSize) {
		this.maxSize = maxSize;
		arr = new int[maxSize];
		start = -1;
		end = -1;
		currSize = 0;
	}

	public void push(int newElement) {
		if (currSize == maxSize) {
			System.out.println("Queue is full\nExiting...");
			System.exit(1);
		}
		if (end == -1) {
			start = 0;
			end = 0;
		} else
			end = (end + 1) % maxSize;
		arr[end] = newElement;
		System.out.println("The element pushed is " + newElement);
		currSize++;
	}

	public int pop() {
		if (start == -1) {
			System.out.println("Queue Empty\nExiting...");
			System.exit(1);
		}
		int popped = arr[start];
		if (currSize == 1) {
			start = -1;
			end = -1;
		} else
			start = (start + 1) % maxSize;
		currSize--;
		return popped;
	}

	public int top() {
		if (start == -1) {
			System.out.println("Queue is Empty");
			System.exit(1);
		}
		return arr[start];
	}

	public int size() {
		return currSize;
	}
	
	boolean isEmpty() {
		return (end == -1 && start == -1);
	}

	int peek() {
		if (isEmpty() == true) {
			System.out.println("Nothing to Peek");
			return -1;
		}
		return arr[start];
	}

	void display() {
		if (isEmpty() == true) {
			System.out.println("Nothing to Display");
		} else {
			for (int i = start; i <= end; i++) {
				System.err.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

}
