package classes;
import java.util.Scanner;

class Vehicle{
	void run() {
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle{
	void run() {
		System.out.println("Bike is running");
	}
}

public class Demo {

	public static void main(String[] args) {
//		System.out.println(Math.sqrt(64));
		
//		printname();
		
		// pass 2 arguments and multiply
		
//		int ans = multiply(10,5);
//		System.out.println(ans);
		
		// Create Scanner
		Scanner userInput = new Scanner(System.in);
		
//		System.out.println("Enter value one");
//		int valOne = userInput.nextInt();
//		
//		System.out.println("Enter value two");
//		int valTwo = userInput.nextInt();
//		
//		ans = multiply(valOne,valTwo);
//		System.out.println(String.format("%2d * %2d is equal to %2d", valOne, valTwo, ans));
//		
//		// pass an integer value and print if it is even or odd
//		String ans2 = IsEven(5);
//		System.out.println("");
//		System.out.println(ans2);
//		
//		int result = square(5);
//		System.out.println(result);
//		
//		double result2 = square(5.5);
//		System.out.println(result2);
		
		Vehicle ob = new Bike();
		ob.run();
		
	}
	
		private static void printname() {
			System.out.println("My Name is a name.");
		}
		
		private static int multiply(int one, int two) {
			int sum = one * two;
			return sum;
		}
		
		private static String IsEven(int value) {
			if(value%2 == 0) {
				return "The value is even";
			}
			else {
				return "The value is odd";
			}
		}
		
		private static int square(int num) {
			return num * num;
		}
		
		private static double square(double num) {
			return num * num;
		}

}
