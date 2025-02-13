package Classes;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		
		Student st4 = new Student(104,"John Cena");
		
		Student st5 = new Student();
		
		st1.setID(100);
		st1.setName("James Corden");
		
		st2.setID(102);
		st2.setName("Mickey Mouse");
		
		st3.setID(103);
		st3.setName("Koolaid Man");
		
		System.out.println(st1.getID());
		System.out.println(st2.getID());
		
		System.out.println(st1.getName());
		System.out.println(st2.getName());
		
		System.out.println(st3.getID());
		System.out.println(st4.getName());
		
		st4.setName("John");
		
		System.out.println(st4.getName());

		System.out.println("Enter the StudentID: ");
		int sID = sc.nextInt();
		st5.setID(sID);
		
		System.out.println(st5.getID());

	}

}
