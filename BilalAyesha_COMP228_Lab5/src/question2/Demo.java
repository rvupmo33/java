package question2;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> shoppingList = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
        	
        	 System.out.println("--- Shopping List Manager ---");
             System.out.println("1. Add an item");
             System.out.println("2. Remove an item");
             System.out.println("3. Update an item");
             System.out.println("4. Display all items");
             System.out.println("5. Search for an item");
             System.out.println("6. Exit");
             System.out.print("Enter an option: ");
             choice = scanner.nextInt();
             scanner.nextLine();
        	
	    	if (choice == 1) {
	             System.out.print("Enter item to add: ");
	             String itemToAdd = scanner.nextLine();
	             shoppingList.add(itemToAdd);
	             System.out.println(itemToAdd + " added to the shoping list.");
	         }
		    else if (choice == 2) {
		        System.out.print("Enter item to remove: ");
		        String itemToRemove = scanner.nextLine();
		        if (shoppingList.contains(itemToRemove)) {
		            shoppingList.remove(itemToRemove);
		            System.out.println(itemToRemove + " removed from the shopping list.");
		        } else {
		            System.out.println(itemToRemove + " is not in the shopping list.");
		        }
		    }
		    else if (choice ==3) {
		    	System.out.print("Enter item to update: ");
                String updateItem = scanner.nextLine();
                if (shoppingList.contains(updateItem)) {
                    System.out.print("Enter the new item: ");
                    String newItem = scanner.nextLine();
                    int index = shoppingList.indexOf(updateItem);
                    shoppingList.set(index, newItem);
                    System.out.println(updateItem + " updated to " + newItem);
                } else {
                    System.out.println(updateItem + " is not in the shopping liist.");
                }
		    }
		    else if(choice == 4) {
		    	if (shoppingList.isEmpty()) {
                    System.out.println("Shopping list is empty.");
                } else {
                    System.out.println("Shopping list items:");
                    for (String item : shoppingList) {
                        System.out.println("- " + item);
                    }
                }
		    }
		    else if(choice ==5) {
		    	System.out.print("Enter item to search: ");
                String itemToSearch = scanner.nextLine();
                if (shoppingList.contains(itemToSearch)) {
                    System.out.println(itemToSearch + " is in the shopping list.");
                } else {
                    System.out.println(itemToSearch + " is not in the shopping list");
                }
		    }
	        else if (choice == 6) {
	            System.out.println("Exiting the program.");
	        }
	        else {
                System.out.println("Invalid choice. Please try again.");
	        }
        	
        } while (choice != 6);

	}

}
