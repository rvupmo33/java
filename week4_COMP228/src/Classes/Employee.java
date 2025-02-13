package Classes;

public class Employee {

	String name;
	int age;
	double salary;
	
	public Employee() {
		System.out.println("I am a parent class constructor");
	}
	
	public Employee(String message) {
		this();
		System.out.println("I am the 2nd constructor");

	}
	
	void print() {
		
		System.out.println("I am an employee");

	}
	
}