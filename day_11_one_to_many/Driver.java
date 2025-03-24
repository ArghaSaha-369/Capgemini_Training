package day_11_one_to_many;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = sc.nextInt();
		
		Bank bank = new Bank(size, "581");
		boolean flag =true;
		
		while(flag) {
			System.out.println("Enter 1 to add customer\nEnter 2 to display customers\nEnter 3 to exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				sc.nextLine();
				System.out.println("Enter Customer Name");
				String name = sc.nextLine();
				Customer customer = new Customer(name);
				bank.addCustomer(customer);
				break;
			case 2:
				bank.displayCustomers();
				break;
			case 3:
				flag= false;
				break;
			}
		}
	}
}
