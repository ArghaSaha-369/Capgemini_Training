package scanner;

import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) {
		boolean flag = true;
		do {
		System.out.println("Which operation do you want to do?\nType 1 for Addition\nType 2 for Subtraction\nType 3 for Multiplication\nType 4 for Division\nType 0 to Exit");
		Scanner sc = new Scanner (System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			Calculator.addMenu();
			break;
		case 2:
			Calculator.subMenu();
			break;
		case 3:
			Calculator.mulMenu();
			break;
		case 4:
			Calculator.divMenu();
			break;
		case 0:
			flag = false;
			System.out.println("Thank you for using the calculator");
			break;
		default:
			System.out.println("Invalid Input");
		}
		}
		while (flag == true);
	}

}
