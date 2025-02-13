package classes;

public interface ExampleInterface {
	
	void print();
	void makeSound();
	

}

class MyClass extends Employee implements ExampleInterface, secondInterface{
	
	public MyClass(String name, int age, String gender) {
		super(name, age, gender);
		
	}

	public void print() {
		
	}
	
	public void makeSound() {
		
	}
	
	public void method1() {
		
	}
	public void method2() {
		
	}

	@Override
	double calculateSalary() {
		return 0;
	}

	@Override
	String printDetail() {
		return null;
	}
}