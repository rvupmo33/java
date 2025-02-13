package classes;
import java.util.ArrayList;
import java.util.Scanner;

public class AveragePositiveIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 
		 ArrayList<Integer> positiveIntegerList = new ArrayList<>();
	     System.out.println("Enter a list of integers, one integer per line. Enter a negative integer to end the list.");

	     do {
	    	 int integer = sc.nextInt();
	    	 
	    	 if (integer > 0) {
	            positiveIntegerList.add(integer);
	    	 } else {
	    		 break;
	    	 }
	    	 
	     } while (true);
	     
	     
	     try {
	    	 
            if (positiveIntegerList.isEmpty()) {
                throw new NoPositiveIntegersException();
            } else {
            	 double total = 0;
                 for (int num : positiveIntegerList) {
                 	total += num;
                 }
                 
                 double average = total / positiveIntegerList.size();
                 
                 System.out.printf("The average of the positive integers is: " + average);
            }
	    	 
	     }catch (NoPositiveIntegersException err) {
	    	  System.out.println(err.getMessage());
	     }
	     
	}

}
