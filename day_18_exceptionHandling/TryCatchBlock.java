package day_18_exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchBlock {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter two numbers");
			int x = scan.nextInt();
			int y = scan.nextInt();
			System.out.println(x / y);
			int[] arr = { 1, 2, 3, 4, 5 };
			System.out.println("Enter the index to access");
			System.out.println(arr[scan.nextInt()]);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException handled");
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException handled");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException handled");
		} catch (Exception e) {
			System.out.println("Exception handled"); //You should always write your generic catch block at the end.
		}
	}
}
