package classes;

public class NoPositiveIntegersException extends Exception {
	public NoPositiveIntegersException() {
        super("There are no positive integers in the list.");
    }
}
