package day_28_generics;

import java.util.HashMap;

public class EmployeeTwo<T, K> {
	T data1;
	K data2;
	
	EmployeeTwo(T data1, K data2){
		this.data1 = data1;
		this.data2 = data2;
	}
	
	public String toString() {
		return data1+ " " +data2;
	}
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.put(null, null);
		
		HashMap<Integer, Integer> hm2 = new HashMap<Integer, Integer>();
		hm2.put(10, 20);
		
 	}
}
