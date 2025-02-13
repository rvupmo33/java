package question1;
import java.util.*;

public class Demo { 
	
	static Queue<Customer> queue = new LinkedList<>();
	
	public static void addCustomerToQueue(String name, String phoneNumber, String city) {
        Customer customer = new Customer(name, phoneNumber, city);
        queue.add(customer);
        System.out.println("Customer added: " + customer);
    }
    
    public static void serveCustomer() {
    	try {
            Customer servedCustomer = queue.remove();
            System.out.println("Served customer: " + servedCustomer);
        } catch (NoSuchElementException e) {
            System.out.println("No customer to servve");
        }
    }
    
    public static void viewNextCustomer() {
        Customer nextCustomer = queue.peek();
        if (nextCustomer == null) {
            System.out.println("No customer in the queue");
        } else {
            System.out.println("Next customer to be served: " + nextCustomer);
        }
    }
    

    public static void displayAllCurrentCustomers() {
        if (queue.isEmpty()) {
            System.out.println("No customers in the queue");
        } else {
            System.out.println("All Customers currently in the queue:");
            for (Customer customer : queue) {
                System.out.println(customer);
            }
        }
    }
    
    public static void checkIfQueueIsEmpty() {
        if (queue.isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            System.out.println("The queue is not empty");
        }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
        int userChoice;
		
		do {
			System.out.println("Options:");
            System.out.println("1. Add a customer to the queue");
            System.out.println("2. Serve a customer");
            System.out.println("3. View the next customer");
            System.out.println("4. Check if queue is empty");
            System.out.println("5. Display all customers who are currently in the queue");
            System.out.println("0. Exit");
            System.out.print("Enter a choice: ");
            userChoice = scanner.nextInt();
            scanner.nextLine(); 

            if (userChoice == 1) {
                System.out.print("Enter customer's name: ");
                String name = scanner.nextLine();
                System.out.print("Enter customer's phone number: ");
                String phoneNumber = scanner.nextLine();
                System.out.print("Enter customer's city: ");
                String city = scanner.nextLine();
                addCustomerToQueue(name, phoneNumber, city);
            } else if (userChoice == 2) {
                serveCustomer();
            } else if (userChoice == 3) {
                viewNextCustomer();
            } else if (userChoice == 4) {
                checkIfQueueIsEmpty();
            } else if (userChoice == 5) {
                displayAllCurrentCustomers();
            } else if (userChoice == 0) {
                System.out.println("Exited.");
            } else {
                System.out.println("Invalid choice. Please try again");
            }
        } while (userChoice != 0);

        scanner.close();
		
	
	}


}
