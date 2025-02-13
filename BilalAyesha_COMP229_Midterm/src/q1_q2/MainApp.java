package q1_q2;
import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		
		ArrayList<Item> itemsList = new ArrayList<Item>();
		
		Book book1 = new Book(101, "Can't Hurt Me", 24.99, "Lioncrest", "Self Help", 364);
        Book book2 = new Book(102, "But How Do It Know?", 17.99, "John C. Scott", "Computer", 222);
        itemsList.add(book1);
        itemsList.add(book2);
        
        Car car1 = new Car(201, "Electric Sports Car", 75000, "Tesla", "Model S");
        Car car2 = new Car(202, "Luxury SUV", 65000, "Mercedes", "GLS");
        itemsList.add(car1);
        itemsList.add(car2);
        
        for (Item item : itemsList) {
            item.Display();
            System.out.println("----------");
        }
        
	}

}
