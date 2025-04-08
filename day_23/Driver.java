package day_23;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CircularSinglyLinkedList list = new CircularSinglyLinkedList();
		boolean flag = true;
		while (flag) {
			System.out.println(
					"Enter 1 to insert data\nEnter 2 to display data\nEnter 3 to Update\nEnter 4 to Insert at Particular Position\nEnter 5 to Delete at Particular Position\nEnter 6 to exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the data");
				int data = sc.nextInt();
				list.insert(data);
				break;
			}
			case 2: {
				list.display();
				break;
			}
			case 3: {
				System.out.println("Enter Position:");
				int position = sc.nextInt();
				System.out.println("Enter to New Data:");
				int newData = sc.nextInt();
				list.update(position, newData);
				break;
			}
			case 4: {
				System.out.println("Enter data to insert:");
				int data = sc.nextInt();
				System.out.println("Enter position:");
				int position = sc.nextInt();
				list.insertAt(data, position);
				break;
			}
			case 5: {
				System.out.println("Enter position:");
				int position = sc.nextInt();
				list.deleteAt(position);
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
