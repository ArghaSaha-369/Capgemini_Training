package day_3;

public class Relational_Operators {
	public static void main(String[] args) {
		System.out.println(10>10.5);
//		System.out.println(true>=false); //error
//		String s1="hello";
//		String s2 = "hello";
//		System.out.println(s1==s2);
//		System.out.println(true==true);
//		System.out.println(10.555d == 10);
		var s= (10>20 && 11>22) ? 10 : 20;
		System.out.println(s);
		
		var s2= (10>20 && 11>22) ? (10+20) : (20+12);
		System.out.println(s2);
	}
}
