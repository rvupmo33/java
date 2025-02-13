package classes;

public class Cat extends Animal{
	
	// a sub class must override all the abstract methods in the super class

	public void makeSound() {
		System.out.println("Meow...");
	}
	
	public void eat() {
		System.out.println("Eating a fish...");

	}

}

abstract class Dog extends Animal{
	public void makeSound() {
		System.out.println("Woof...");
	}
	
	public void eat() {
		System.out.println("Chewing on a bone...");

	}
}