package Classes;

public class Dog {
	static String address;
	int age;
	String name;
	
	static int dogCount = 0;
	
	static final int max_lifespan = 10;
	
	public Dog()
	{
		dogCount ++;
	}
}
