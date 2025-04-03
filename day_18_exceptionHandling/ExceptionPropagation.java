package day_18_exceptionHandling;

public class ExceptionPropagation {
	public static void main(String[] args) {
		alpha();
	}

	public static void alpha() {
		System.out.println("Alpha Method");
		beta();
	}

	public static void beta() {
		System.out.println("Beta Method");
		gamma();
	}

	public static void gamma() {
		System.out.println("Gamma Method");
		try {
		System.out.println(10/0);
		}
		catch(ArithmeticException e){
			System.out.println("Arithmatic Exception Handled");
		}
		System.out.println("End of Gamma");
	}
}
