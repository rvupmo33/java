package q1_q2;

public abstract class Item {
	int itemNo;
	String description;
	double unitPrice;
	
	public Item(int itemNo, String description, double unitPrice) {
		this.itemNo = itemNo;
		this.description = description;
		this.unitPrice = unitPrice;
	}
	
	public void Display() {
        System.out.println("Item Number: " + itemNo);
        System.out.println("Description: " + description);
        System.out.println("Unit Price: $" + unitPrice);
    }
}
