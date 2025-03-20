package day_6;

import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
		checkPrime();
	}
	
	public static void checkPrime() {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num <= 0 && num == 1) {
			System.out.println("Not Prime");
		}
		for(int i=2; i<=num; i++) {
			if(num%i == 0) {
				System.out.println("Not Prime");
				break;
			}
			else {
				System.out.println("Prime Number it is!");
				break;
			}
		}
		
	}
}


