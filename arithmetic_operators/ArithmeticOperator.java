package arithmetic_operators;

public class ArithmeticOperator {
	public static void main(String[] args) {
//		int a,b,c;
//		a=10; b= 20;
//		c=a+b;
//		System.out.println(c);
		
		String s = "hello" + true;
		System.out.println(s);
		
		System.out.println('a'+'b'); //195
		System.out.println("a" + "b"); //ab
		System.out.println("true" + 'c');
//		System.out.println(10 + true + "hello"); //Throws error
		System.out.println(10 + "hello" + true);
		byte b = 127;
		System.out.println(b);
		
//		byte x = (10+20);
		
		int x = 10;
		long y = 2;
		long z = x/y;
		System.out.println(z);
		
		float f = 10.56f;
//		double d = 10.44d;
//		System.out.println(f+d); //returns double
		
//		int d = 10.5/10;
//		int d = 5/2;
		System.out.println(d);
		
		int _ = 10;
		System.out.println(_);
		
//		byte a = 10;
//		byte b = 20;
//		byte x = a+b;
		
	}
}
