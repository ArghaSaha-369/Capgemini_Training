package day_3;

public class even_odd {
	public static void main(String[] args) {
		
	
	int a= 10;
	if (a%2==0 && a>0) {
		System.out.println("Positive Even");
	}
		
	else if (a%2==0 && a<0){
			System.out.println("Negative Even");
		}
	else {
		if (a>0) {
			System.out.println("Positive Odd");
		}
		else {
			System.out.println("Negative Odd");
		}
	}
}}
