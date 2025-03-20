package scanner;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
//		addMenu();
	}

	public static void addMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"How many numbers do you want to add?\nEnter 2 for two number\nEnter 3 for three numbers\nEnter 4 for four numbers\n");
		int choice = sc.nextInt();
		switch (choice) {
		case 2:
			System.out.println("Enter First Number");
			double a = sc.nextDouble();
			System.out.println("Enter Second Number:");
			double b = sc.nextDouble();
			System.out.println(a+b);
			break;
			
		case 3:
			System.out.println("Enter First Number:");
			double c = sc.nextDouble();
			System.out.println("Enter Second Number:");
			double d = sc.nextDouble();
			System.out.println("Enter Third Number:");
			double e= sc.nextDouble();
			System.out.println(c+d+e);
			break;
			
		case 4:
			System.out.println("Enter First Number:");
			double f = sc.nextDouble();
			System.out.println("Enter Second Number:");
			double g = sc.nextDouble();
			System.out.println("Enter Third Number:");
			double h= sc.nextDouble();
			System.out.println("Enter Fourth Number:");
			double i= sc.nextDouble();
			System.out.println(f+g+h+i);
			break;
			
		default:
			System.out.println("Invalid Input");
		}
	}
	
	public static void subMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"How many numbers do you want to sub?\nEnter 2 for two number\nEnter 3 for three numbers\nEnter 4 for four numbers\n");
		int choice = sc.nextInt();
		switch (choice) {
		case 2:
			System.out.println("Enter First Number");
			double a = sc.nextDouble();
			System.out.println("Enter Second Number:");
			double b = sc.nextDouble();
			System.out.println(a-b);
			break;
			
		case 3:
			System.out.println("Enter First Number:");
			double c = sc.nextDouble();
			System.out.println("Enter Second Number:");
			double d = sc.nextDouble();
			System.out.println("Enter Third Number:");
			double e= sc.nextDouble();
			System.out.println(c-d-e);
			break;
			
		case 4:
			System.out.println("Enter First Number:");
			double f = sc.nextDouble();
			System.out.println("Enter Second Number:");
			double g = sc.nextDouble();
			System.out.println("Enter Third Number:");
			double h= sc.nextDouble();
			System.out.println("Enter Fourth Number:");
			double i= sc.nextDouble();
			System.out.println(f-g-h-i);
			break;
			
		default:
			System.out.println("Invalid Input");
		}
	}
	
	public static void mulMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"How many numbers do you want to mul?\nEnter 2 for two number\nEnter 3 for three numbers\nEnter 4 for four numbers\n");
		int choice = sc.nextInt();
		switch (choice) {
		case 2:
			System.out.println("Enter First Number");
			double a = sc.nextDouble();
			System.out.println("Enter Second Number:");
			double b = sc.nextDouble();
			System.out.println(a*b);
			break;
			
		case 3:
			System.out.println("Enter First Number:");
			double c = sc.nextDouble();
			System.out.println("Enter Second Number:");
			double d = sc.nextDouble();
			System.out.println("Enter Third Number:");
			double e= sc.nextDouble();
			System.out.println(c*d*e);
			break;
			
		case 4:
			System.out.println("Enter First Number:");
			double f = sc.nextDouble();
			System.out.println("Enter Second Number:");
			double g = sc.nextDouble();
			System.out.println("Enter Third Number:");
			double h= sc.nextDouble();
			System.out.println("Enter Fourth Number:");
			double i= sc.nextDouble();
			System.out.println(f*g*h*i);
			break;
			
		default:
			System.out.println("Invalid Input");
		}
	}
	
	public static void divMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int a = sc.nextInt();
		System.out.println("Enter Second Number:");
		int b = sc.nextInt();
		System.out.println(a/b);
	}
		
	}