package day_12_inheritence;

public class Parent {
	static int a =10;
	int b = 5;
	
	static void print() {
		System.out.println("This is a Static Method");
	}
	
	public void message() {
		System.out.println("This is a Non-Static Method");
	}
	
	static {
		System.out.println("Static Initializer");
	}
	
	{
		System.out.println("Non-Static Initializer");
	}
	Parent(){
		System.out.println("This is Parent Constructor");
	}
}
