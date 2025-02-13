package defaultPkg;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a value: ");
//		int num = sc.nextInt();
//		
//		System.out.println("Enter a second value: ");
//		int num2 = sc.nextInt();
//		
//		System.out.println("Hello");
//		System.out.println("World");
		
		File f1 = new File("E//File.txt");
		try {
			FileReader fr = new FileReader(f1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
