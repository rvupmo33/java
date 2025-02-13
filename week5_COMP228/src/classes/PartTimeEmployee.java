package classes;

public class PartTimeEmployee extends Employee {
	
	private double hoursWorked;
	private double hourlyRate;
	
	PartTimeEmployee(String name, int age, String gender, double hoursWorked, double hourlyRate){
		super(name,age,gender);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	@Override
	double calculateSalary() {
		return hoursWorked * hourlyRate;
	}
	@Override
    String printDetail() {
        return String.format("Name: %s, Age: %d, Gender: %s, Hours Worked: %.2f, Hourly Rate: %.2f, Total Salary: %.2f",
                name, age, gender, hoursWorked, hourlyRate, calculateSalary());
    }

}
