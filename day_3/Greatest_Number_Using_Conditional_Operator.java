package day_3;

public class Greatest_Number_Using_Conditional_Operator {
	public static void main(String[] args) {
//		var s = (10>20)? 10 : (20>5)? 20: (10>5)? 10: 5;
		int a = 10, b = 20, c = 5;
		var s = (a>b)&&(a>c)?a:(b>c)?b:c;
		
		System.out.println(s);
	}
}
