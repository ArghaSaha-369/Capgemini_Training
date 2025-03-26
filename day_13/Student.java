package day_13;

public class Student extends Person {
	private int studentId;
	Student(String name, int age, int studentId){
		super(name, age);
		this.studentId = studentId;
		
	}
	
	
	
	public int getStudentId() {
		return studentId;
	}



	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}



	public void displayStudentClass() {
		System.out.println(getName()+" is of "+getAge()+" with StudentID "+getStudentId());
	}
}
