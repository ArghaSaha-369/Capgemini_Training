package day_8;

import java.util.*;

public class Greatest_Element_2DArray {
	public static void main(String[] args) {
		System.out.println((greatestNumber(createArray())));
	}
	public static int[][] createArray() {
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
		return arr;
	}
	public static int greatestNumber(int arr[][]) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				max = Math.max(arr[i][j], max);
				}
			}
		return max;
	}
}
