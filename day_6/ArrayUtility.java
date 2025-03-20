package day_6;

import java.util.Arrays;

public class ArrayUtility {
	public static void main(String[] args) {
		int[]  arr = new int[] {1, 4, 45, 67, 78};
		int target = 45;
		System.out.println(Arrays.binarySearch(arr, target));
		
		int[] array = Arrays.copyOf(arr, 7);
		for (int i : array) {
			System.out.println(i);
		}
		
		int[] array2 = Arrays.copyOfRange(arr, 2, 4);
		for (int i : array2) {
			System.out.println(i);
		}
		
		System.out.println(Arrays.equals(arr, array2));
		
		int[] array3 = {2,5,4,3,1};
		Arrays.sort(array3);
		for (int j : array3) {
			System.out.println(j);
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}
