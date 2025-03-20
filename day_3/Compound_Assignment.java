package day_3;

public class Compound_Assignment {
	public static void main(String[] args) {
		byte b = 10;
//		b = b+1; // Throws error
		b += 1;
		double c = 7.0/0.0;
		System.out.println(c);
		float a = 10.5f;
		long l= (long) a;
		System.out.println(l);
		
		char ch = 'c';
		int g = (int)ch;
		System.out.println(g);
		
		
		int h= 99;
		char chh = (char) h;
		System.out.println(chh);
		
		
	}
}
