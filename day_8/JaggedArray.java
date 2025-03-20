package day_8;

import java.util.*;

public class JaggedArray {
	public static void main(String[] args) {
		createJaggedArray();
	}

	public static void createJaggedArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows:\n");
		int r = sc.nextInt();

		int[][] arr = new int[r][];
		for (int i = 0; i < r; i++) {
			System.out.println("Enter number of element in column:" + (i + 1));
			int n = sc.nextInt();
			arr[i] = new int[n];
		}
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr[j].length; i++) {
				arr[j][i] = sc.nextInt();
			}
		}
	}
}
