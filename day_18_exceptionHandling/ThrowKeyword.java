package day_18_exceptionHandling;

public class ThrowKeyword {
	public static void div(int x, int y) throws Exception {
		if (y != 0) {
			System.out.println(x/y);
		}
		else {
			throw new Exception ("Denominator is Zero");
		}
	}
	
	public static void main(String[] args) {
		try {
			div(10,0);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("Main End");
		}
	}
}
