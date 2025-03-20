package day_6;

import java.util.Scanner;

public class PalindromArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of the Elements in your array?");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements:\n");
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int j=0; j<n; j++) {
			if(arr[j]== arr[(n-1)-j]) {
				System.out.println("Palindrom");
				break;
			}
		}
	}
}
