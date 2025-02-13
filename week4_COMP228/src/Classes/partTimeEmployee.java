package Classes;

public class partTimeEmployee extends Employee {
	
	public partTimeEmployee() {
		super("hi");
		System.out.println("I am a child class constructor");
	}
	
	public partTimeEmployee(int number) {
		this();
		System.out.println("I am " + number + " years old");

	}
	public partTimeEmployee(String name) {
		this(18);
		System.out.println("I am " + name);

	}
	
	
	
	public void method1() {
		System.out.println(name);
	}
	void print() 
	{
		System.out.println("I am a part-time employee");
	}
}
