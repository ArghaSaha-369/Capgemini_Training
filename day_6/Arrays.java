package day_6;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
//		int[] arr = new int[] {1, 30, 33 };
		int[] arr = new int[5];
		for (int i=0; i<arr.length;i++) {
			Scanner sc = new Scanner(System.in);
			arr[i] = sc.nextInt();
		}
		System.out.println(arr);
	}
}
