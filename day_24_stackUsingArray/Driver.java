package day_24_stackUsingArray;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack s = new Stack();
		boolean flag = true;
		while (flag) {
			System.out.println(
					"Enter 1 to Push element\nEnter 2 to Pop element\nEnter 3 to Display Elements\nEnter 4 to Peek into the Stack\nEnter 5 to Check if the Stack is Empty\nEnter 6 to Exit\n");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the data to Push:");
				int data = sc.nextInt();
				s.push(data);
				break;
			}
			case 2: {
				System.out.println("The popped element is " + s.pop());
				break;
			}
			case 3: {
				System.out.println("Displaying Elements.....");
				s.display();
				break;
				
			}
			case 4: {
				System.out.println("Peeking into the Stack....");
				s.peek();
				break;
			}
			case 5: {
				System.out.println("Checking if the stack is empty....");
				s.isEmpty();
				break;
			}
			case 6: {
				flag = false;
				break;
			}
			default:
				System.out.println("Invalid Choice");
			}
		}
	}
}
