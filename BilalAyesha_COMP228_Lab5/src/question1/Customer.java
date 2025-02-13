package question1;

public class Customer {
	private String name;
    private String phoneNumber;
    private String city;
    
    public Customer(String name, String phoneNumber, String city) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }
    
    @Override
    public String toString() {
        return "Customer[ Name: " + name + ", phoneNumber: " + phoneNumber + ", city: " + city + "]";
    }

}
