package day_8;

import java.util.Scanner;

public class CheckSymmetry_2DArray {
	public static void main(String[] args) {
//		if(checkSymmetry(createArray())==true) {
//			System.out.println("Symmetric");
//		}
//		else {
//			System.out.println("Not Symmetric");
//		}
	
		transposeArray(createArray());
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
	
	public static void transposeArray(int arr[][]) {
		for (int i=0; i<arr.length; i++) {
			for(int j=i+1; j< arr[i].length; j++) {
				int temp = arr[i][j];
				
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		for (int[] i : arr) {
			for (int j: i) {
				System.out.print(j + " ");
			}
		System.out.println();
		}
	}
	
	
	
	public static boolean checkSymmetry(int arr[][]) {
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j< arr[i].length; j++) {
				if (arr[i][j] != arr[j][i]) {
					return false;
					
				}
			}
		}
		return true;
	}
}
