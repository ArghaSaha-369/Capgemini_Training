
public class WrapperClass {
public static void main(String[] args) {
	int i = 10;
	Integer x = new Integer(i); //boxing
	System.out.println("x: "+x);
	Integer z = Integer.valueOf(i);
	
	Integer y = i; //auto-boxing
	System.out.println("y: "+y);
	
	int a = y.intValue(); // unboxing
	Boolean flag = true;
	boolean b = flag.booleanValue();
	System.out.println("a: "+a+" "+"b: " + b);
	
	Character ch = 'a'; //auto-boxing
	char c = ch; //autp-unboxing
	
	Integer m = 10;
	Integer n = 10;
	System.out.println(m==n); //returns true
}
}
