package methods;

public class Search {
	public static void main(String[] args) {
		keySearch(4);
	}
	
	public static void keySearch(int num) {
		int arr[] = {2, 3, 4, 5};
		for (int i=0; i< 4; i++) {
			if (arr[i] == num) {
				System.out.println("Num Found");
			}
		}
	}
}
 