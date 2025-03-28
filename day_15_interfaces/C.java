package day_15_interfaces;

public interface C extends A, B{
	default void check() {
//		System.out.print(a); //Will throw error
		System.out.println(A.a);
//		message(); \\Will throw error
		A.message();
		B.message();
		print();
	}
	
	@Override
	default void print() {
		B.super.print();
	}
	

	public static void main(String[] args) {
//		check(); //Default methods can't be accessed in static context in interface
	}
}
