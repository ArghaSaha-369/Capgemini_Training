package day_17_objectClass;

public class Driver {
	public static void main(String[] args) {
		Employee e = new Employee(1, 22200, "Argha");
		System.out.println(e);
		System.out.println(e.toString());

		Employee e1 = new Employee(1, 22200, "Argha");
		Employee e2 = new Employee(1, 22200, "Argha");

		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));

		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

		String s = "Argha";
		System.out.println(s.hashCode());

	}
}
