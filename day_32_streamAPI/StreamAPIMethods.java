package day_32_streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamAPIMethods {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,1,2,5,8,7,4,3,1);
		System.out.println(list);
		
		Stream s = list.stream();
		Stream s2 = s.distinct();
		s2.forEach(n->System.out.println(n));
		
		Optional<Integer> optional = list.stream().distinct().min((o1,o2)-> o1 - o2);
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		
		//toList()
		System.out.println();
		List<Integer> li = list.stream().distinct().filter(n -> n%2 == 0).toList();
		System.out.println(li);
		
		Stream s3 = Stream.of(1, 4, 7, 3, "Demo", 98.6);
		s3.forEach(n->System.out.println(n));
		System.out.println("------------------");
		
		//findFirst()
		Optional<Integer> op = 
	}
}
