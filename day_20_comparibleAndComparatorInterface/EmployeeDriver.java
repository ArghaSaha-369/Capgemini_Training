package day_20_comparibleAndComparatorInterface;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Argha", 48000);
		Employee e2 = new Employee(2, "Swastika", 50000);

		if (e1.compareTo(e2) >= 1) {
			System.out.println("e1 is greater");
		} else if (e1.compareTo(e2) < 0) {
			System.out.println("e2 is greater");
		} else {
			System.out.println("Equal!");
		}
		
		compareBasedOnName(e1, e2);
		compareBasedOnId(e1, e2);
	}
	
	public static void compareBasedOnName(Employee e1, Employee e2) {
		if (e1.compareTo(e2) > 0) {
			System.out.println("e1 is greater");
		} else if (e1.compareTo(e2) < 0) {
			System.out.println("e2 is greater");
		} else {
			System.out.println("Equal!");
		}
	}
	
	public static void compareBasedOnId(Employee e1, Employee e2) {
		
		
		if (e1.compareTo(e2) > 0) {
			System.out.println("e1 is greater");
		} else if (e1.compareTo(e2) < 0) {
			System.out.println("e2 is greater");
		} else {
			System.out.println("Equal!");
		}
	}
}
