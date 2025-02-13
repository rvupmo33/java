package classes;

public class Overload {
	
	public static int addition(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int addition(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public static int addition(int num1, int num2, int num3, int num4) {
		return num1 + num2 + num3 + num4;
	}

	public static void main(String[] args) {
		
		int sum1 = addition(1,2);
		int sum2 = addition(1,2,3);
		int sum3 = addition(1,2,3,4);
		
		System.out.println("Overload 1: "+ sum1);
		System.out.println("Overload 2: "+ sum2);
		System.out.println("Overload 3: "+ sum3);

	}

}
