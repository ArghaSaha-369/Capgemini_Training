package day_15_interfaces;

public class D implements A, B{
	
	@Override
	public void print() {
		B.super.print();
	} 
}
