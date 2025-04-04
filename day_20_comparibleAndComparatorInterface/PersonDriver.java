package day_20_comparibleAndComparatorInterface;

public class PersonDriver {
	public static void main(String[] args) {
		Person p1 = new Person(24, "Rohit");
		Person p2 = new Person(26, "Rohit");
		
		if (p1.compareTo(p2) > 0) {
			System.out.println("p1 is greater");
		} else if (p1.compareTo(p2) < 0) {
			System.out.println("p2 is greater");
		} else {
			System.out.println("Names are Equal! Age is not");
		}
	}
	
}
