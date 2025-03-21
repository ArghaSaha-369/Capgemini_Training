package day_9;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Argha Saha", 50000);
		Employee e2 = new Employee(1, "Argha Saha", 50000, "Capgemini");
		System.out.println("ID:" +e1.id + "\nName:"+e1.name+ "\nSalary: "+e1.salary);
		System.out.println("ID:" +e2.id + "\nName:"+e2.name+ "\nSalary: "+e2.salary+"\nCompany:"+e2.company);
	}
}
