package classes;

public abstract class Employee {
	String name;
	int age;
	String gender;
	
    public Employee(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
	
	abstract double calculateSalary();
	abstract String printDetail();

}
