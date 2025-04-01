package day_17_stringClass;

public class Demo {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = new String("hello");
		char[] arr = {'J', 'A', 'V', 'A'};
		String s3 = new String(arr);
		System.out.println(s1+" "+s2+" "+s3);
		
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(2));
		System.out.println(s1.codePointAt(1));
		s1 = s1.concat("World");
		System.out.println(s1);
		String message = "What a Wonderful World";
		System.out.println(message.contains("a"));
		System.out.println(message.contains("World")); 
	}
}
