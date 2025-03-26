package day_13;

public class Sub extends Super{
	String a = "KKRpaglu";
	static String b = "Dipanjan";
	
	public void print() {
		System.out.println(a);
		System.out.println(super.a);
		System.out.println(b);
		System.out.println(super.b);
		System.out.println(Super.b);
	}
}
