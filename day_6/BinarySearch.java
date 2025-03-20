package day_6;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int k = binarySearching();
		if (k == -1) {
			System.out.println("Num Not Found");
		} else {
			System.out.println(k);
			
		}
	}

	public static int binarySearching() {
		int[] arr = { 8, 7, 5, 6, 4 };
		int t = 9;
		Arrays.sort(arr);
		int s = 0;
		int e = arr.length - 1;
		
		while (s <= e) {
			int mid = (s + e) / 2;
			if (arr[mid] == t) {
				return mid;
			} else if (arr[mid] > t) {
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		return -1;
	}
}
