package day_24_stackUsingArray;

class Stack {
	int size = 10000;
	int arr[] = new int[size];
	int top = -1;

	void push(int x) {
		top++;
		arr[top] = x;
	}

	int pop() {
		int x = arr[top];
		top--;
		return x;
	}

	int top() {
		return arr[top];
	}

	int size() {
		return top + 1;
	}

	boolean isEmpty() {
		return (top == -1);
	}

	int peek() {
		if (isEmpty() == true) {
			System.out.println("Nothing to Peek");
		}
		return arr[top];
	}

	void display() {
		if (isEmpty() == true) {
			System.out.println("Nothing to Display");
		} else {
			for (int i = 0; i <= top; i++) {
				System.err.print(arr[i] + " ");
			}
			System.out.println();
		}
	}
}
