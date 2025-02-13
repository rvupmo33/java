package classes;

public class FulltimeEmployee extends Employee {
	
	private double basicSalary;
	private double bonus;
	
	FulltimeEmployee(String name, int age, String gender, double basicSalary, double bonus){
		super(name,age,gender);
		this.basicSalary = basicSalary;
		this.bonus = bonus;
	}

	@Override
	double calculateSalary() {
		return basicSalary + bonus;
	}
	@Override
    String printDetail() {
        return String.format("Name: %s, Age: %d, Gender: %s, Basic Salary: %.2f, Bonus: %.2f, Total Salary: %.2f",
                name, age, gender, basicSalary, bonus, calculateSalary());
    }

}
