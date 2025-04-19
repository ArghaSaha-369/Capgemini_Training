package day_31_lambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDriver {
	public static void main(String[] args) {
		LambdaDemo d1 = () -> System.out.println("Hello");
		LambdaDemo2 d2 = () -> System.out.println("Hello");
		LambdaDemo3 d3 = (x, y) -> {
			System.out.println(x+y);
			return 0;	
		};
		
		
		d1.print();
		d2.greet();
		d3.add(2,3);
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		System.out.println(list);
		Comparator<Integer> comparator = (o1, o2) -> o2-o1;
		Collections.sort(list, comparator);
		System.out.println(list);
		
	}
}
