package classes;

import javax.swing.*;
import java.util.Random;

public class Lotto {
    private int[] numbers;

    public Lotto() {
        numbers = new int[3];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(9) + 1; 
        }
    }

    public int[] getNumbers() {
        return numbers;
    }


    public int calculateSum() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        int userInput;
        int attempts = 5;
        boolean userWins = false;
        int currentSum;

        String input = JOptionPane.showInputDialog("Enter a number between 3 and 27:");
        
        userInput = Integer.parseInt(input);

        for (int i = 1; i <= attempts; i++) {
            Lotto att1 = new Lotto();
            currentSum = att1.calculateSum();
            JOptionPane.showMessageDialog(null, "Round " + i + ": The lotto numbers are " + att1.getNumbers()[0] + ", " + att1.getNumbers()[1] + ", " + att1.getNumbers()[2] + "\nTotal Sum is: " + currentSum);

            if (currentSum == userInput) {
                userWins = true;
                JOptionPane.showMessageDialog(null, "Congrats! You win!");
                break;
            }
            
        }

        if (!userWins) {
            JOptionPane.showMessageDialog(null, "Sorry! You lost!");
        }
    }
}

