package day_8;

import java.util.*;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows:\n");
		int m = sc.nextInt();
		System.out.println("Enter Number of Columns:\n");
		int n = sc.nextInt();
		System.out.println("Enter the elements:\n");
		int[][] arr = new int[m][n];
		
		for(int i =0; i< arr.length; i++) {
			for(int j= 0; j< arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
				
			}
		}
		System.out.println("Printing Method 1(Using For Loop)");
		for(int i =0; i< arr.length; i++) {
			for(int j= 0; j< arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println();
		}
		System.out.println("Printing Method 2 (Using Method)");
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println("Printing Method 3 (Using For Each Loop)");
		for (int[] i : arr) {
			for (int j: i) {
				System.out.print(j + " ");
			}
		System.out.println();
		}
	}
}
 