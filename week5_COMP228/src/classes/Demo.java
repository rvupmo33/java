package classes;

public class Demo {

	public static void main(String[] args) {
		FulltimeEmployee employee = new FulltimeEmployee("Alissa", 27, "Female", 4000, 200);
		System.out.println(employee.printDetail());
		System.out.println("Salary: "+ employee.calculateSalary());
		
		PartTimeEmployee employee2 = new PartTimeEmployee("James", 23, "Male", 120, 18);
		System.out.println(employee2.printDetail());
		System.out.println("Salary: "+ employee2.calculateSalary());
		}

}
