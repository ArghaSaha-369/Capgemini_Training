package day_15_finalKeyword;

public class Demo {
	final int a = 10;
	{
//		a=20; //Can't be reassigned as final is used
	}
	
	final void demoMethod() {
		System.out.println("Demo Text");
	}
	//It can't be overridden
}
