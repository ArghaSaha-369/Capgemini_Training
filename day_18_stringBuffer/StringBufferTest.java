package day_18_stringBuffer;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer();
		str.append(false);
		str.append("hello");
		System.out.println(str);

		StringBuffer str2 = new StringBuffer("Hello World");
		System.out.println(str2);
		
		char[] arr = {'a', 'b', 'c'};
		StringBuffer str3 = new StringBuffer(150);
		str3.append(arr);
		System.out.println(str3);
		
		System.out.println(str3.capacity());
		str3.ensureCapacity(189);
		System.out.println(str3.capacity());
		
		
		str2.delete(0, 4);
		System.out.println(str2);
		
		StringBuffer str4 = new StringBuffer("Hello");
		str4.insert(4, arr, 1, 2);
		System.out.println(str4);
		
		System.out.println(str4.reverse());
		
		str3.setCharAt(0, 'k');
		System.out.println(str3);
	}

}
