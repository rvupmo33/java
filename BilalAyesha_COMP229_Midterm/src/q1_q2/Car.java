package q1_q2;

public class Car extends Item {
	
	private String model;
	private String type;
	
	public Car(int itemNo, String description, double unitPrice, String model, String type) {
		super(itemNo, description, unitPrice);
		this.model = model;
		this.type = type;
	}

	@Override
	public void Display() {
        super.Display();
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
    }

}
