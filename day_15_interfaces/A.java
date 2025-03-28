package day_15_interfaces;

public interface A {
	int a = 10;
	
	static void message(){
		System.out.println("Sample Message A Interface");
	}
	
	default void print() {
		System.out.println("Print A Interface");
	}
}
