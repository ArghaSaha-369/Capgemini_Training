package day_10;

public class Initializer {
	static {
		System.out.println("Will print before main method");
	}
	static {
		System.out.println("Multiple initializers can be performed");
	}
	
	public Initializer() {
		System.out.println("Constructor Called");
	}
	
	{
		System.out.println("Non-Static Initializer. Will be called before Constructor");
	}
	
	{
		System.out.println("2nd Non-Static Statement");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method Prints after the execution of Static Initializer");
		Initializer s1 = new Initializer();
		Initializer s2 = new Initializer();
	}
}


