package scanner;

import java.util.Scanner;

//import java.util.Scanner;
//import java.util.*;


public class UserInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter First Number:");
		int num1 = scan.nextInt();
		System.out.println("Enter Second Number:");
		int num2 = scan.nextInt();
		
		System.out.println(num1+ num2);
	}
}
