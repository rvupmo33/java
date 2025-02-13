package classes;

public abstract class Animal {
	
	String name;
	int age;
	
	abstract void makeSound();
	abstract void eat();
	
	void printAnimalName() {
		System.out.println(name);
	}
	
	public Animal() {
		
	}
	
	public static void print() {
		
	}
	
}