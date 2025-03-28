package day_15_interfaces;

public interface B {
	double a = 30;
	
	static void message(){
		System.out.println("Sample Message B Interface");
	}
	
	default void print() {
		System.out.println("Print B Interface");
	}
}
