package day_16;

/*
Question:

Given an array of integers arr[], the task is to move all the zeros to the end of the array while maintaining the relative order of all non-zero elements.
Examples:
Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: arr[] = [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three Os that are moved to the end.

Input: arr[] = [10, 20, 30]
Output: arr[] = [10, 20, 30]
Explanation: No change in array as there are no Os.
Input: arr[] = [0, 0]

Output: arr[] = [0, 0]
Explanation: No change in array as there are all Os.
Note:
stepl: read the size of the Array
step2: read the elements of the array
Step 3:print the final output by using Arrays.toString() method by using printin() statement



*/

import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[index++] = arr[i];
			}
		}
		while (index < arr.length) {
			arr[index++] = 0;
		}
		System.out.println(Arrays.toString(arr));
	}
}
