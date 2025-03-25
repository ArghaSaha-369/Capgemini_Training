package day_12_inheritence;

public class Child extends Parent {
	public void display() {
		System.out.println(b);
		System.out.println(a);
		message(); //Non-static methods are inherited
		print(); //Static methods are also inherited
	}
}
