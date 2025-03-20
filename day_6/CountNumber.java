package day_6;

import java.util.Scanner;

public class CountNumber {
	public static void main(String[] args) {
		countNumber();
	}
	
	public static void countNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to count:\n");
		int num = sc.nextInt();
		int count = 0;
		while(num!=0) {
			num/=10;
			count++;
		}
		System.out.println("The count is "+ count);
	}
}
