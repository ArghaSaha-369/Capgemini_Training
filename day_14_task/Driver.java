package day_14_task;

public class Driver {
	public static void main(String[] args) {
		Employee e = new FullTimeEmployee("Argha", 120000, 4500);
		e.employeeInfo();
		Employee d = (FullTimeEmployee) e;
		d.jobRole();

		Employee e2 = new PartTimeEmployee("Argha", 30000, 8);
		e2.employeeInfo();
		details(e2);

	}
	
	static void details(Employee e3) {
		if (e3 instanceof FullTimeEmployee) { 
			e3.jobRole();
		}
		else {
			((PartTimeEmployee)e3).designation();
		}
		
	}
}
