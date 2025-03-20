package scanner;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x = scan.nextInt();
		scan.nextLine();
		System.out.println(x);
		System.out.println("Enter a String");
		String s = scan.nextLine();
		System.out.println(s);
	}
}
