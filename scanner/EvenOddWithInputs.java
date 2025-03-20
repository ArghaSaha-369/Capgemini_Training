package scanner;

import java.util.Scanner;

public class EvenOddWithInputs {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		if (a % 2 == 0 && a > 0) {
			System.out.println("Positive Even");
		}

		else if (a % 2 == 0 && a < 0) {
			System.out.println("Negative Even");
		} 
		
		else if (a % 2 != 0 && a < 0) {
			System.out.println("Negative Odd");
		} 
		
		else {
			System.out.println("Negative Even");
		}
		
//		else {
//			if (a > 0) {
//				System.out.println("Positive Odd");
//			} else {
//				System.out.println("Negative Odd");
//			}
//		}
	}
}