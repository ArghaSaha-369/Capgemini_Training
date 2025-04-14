package day_28_generics;

public class Employee<T> {
	T data1;
	T data2;
	
	Employee(T data1, T data2){
		this.data1 = data1;
		this.data2 = data2;
	}
	
	public String toString() {
		return data1+ " " +data2;
	}
	
	public static <T> void print(T[] arr) {
		for(T i : arr) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(10, "hello");
		System.out.println(e1);
		System.out.println(e1.data1 instanceof Object); //True
		System.out.println(e1.data1 instanceof Integer); //True
		
		Employee <Integer> e2 = new Employee<Integer>(10,20);
		System.out.println(e2.data1 + e2.data2);
		
		Employee <String> e3 = new Employee<String>("Hello", "Hi");
		
		Employee<Boolean> e4 = new Employee<Boolean>(true, false);
		
		Integer[] arr1 = {1,2,3,4,5};
		String[] arr2 = {"Hello", "World", "Demo"};
		
		print(arr1);
		
 	}
}
