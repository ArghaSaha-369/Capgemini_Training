package methods;

public class Method {
	public static void main(String[] args) {
		System.out.println("Main Started");
		add2();
		add1();
		add4(2, 3.4);
	}
//	Methods with no argument and no return type
	public static void message() {
		System.out.println("Print");
	}
	
//	Methods with no argument but has a return type
	public static int add1() {
		int a = 3;
		int b = 5;
		System.out.println(a+b);
		return a+b;
	} 
	
	public static int add2() {
		double a = 3.0;
		double b = 5.0;
		double result = a + b;
		System.out.println((int)result);
		return (int) result;
	}


//Methods with argument but has no return type
	public static void add3(int num1, int num2) {
		int sum = num1 + num2;
	}
	
//Methods with argument and has return type	
	public static double add4(int num3, double num4) {
		double sum2 = num3 + num4;
		System.out.println(sum2);
		return sum2;
		
	}
}
