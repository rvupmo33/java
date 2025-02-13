package classes;
import java.util.Random;

import javax.swing.*;

public class Test {
	int correctAnswers = 0;
	int incorrectAnswers = 0;

	
	String[][] questions = {
	    {"What is a class?", "Collection of related objects", "Comma-separated list", "Interface", "Taught by a teacher", "1"},
	    {"Which variable name is properly named?", "RANDOMNUMBER", "RandOmNumber", "randomNumber", "randomnumber", "3"},
	    {"What does inheritance allow in Java?", "Code reuse", "Code duplication", "Code destruction", "None of the above", "1"},
	    {"Which of the following is a superclass?", "A class that inherits another class", "A class derived from another class", "A class with no subclasses", "A class that has no parent", "3"},
	    {"What is the Object class?", "The bottom of the class hierarchy", "The top of the class hierarchy", "An interface", "A method", "2"}
	};
	
	public void simulateQuestion(int questionIndex) {
	
		String[] question = questions[questionIndex];
		
		StringBuilder answerFormat = new StringBuilder();
		
		for (int i = 1; i <= 4; i++) {
			answerFormat.append(i).append(". ").append(question[i]).append("\n");
		}
	
		String userAnswer = JOptionPane.showInputDialog(null, "Question " + (questionIndex + 1) + ": " + question[0] + "\n" + answerFormat,"Test Question", JOptionPane.QUESTION_MESSAGE);
		
	    checkAnswer(questionIndex, userAnswer);
    
	}
	
	public void checkAnswer(int questionIndex, String userAnswer) {
		
	    String correctAnswer = questions[questionIndex][5];
	    boolean isCorrect = userAnswer != null && userAnswer.equals(correctAnswer);
	    
        String message = generateMessage(isCorrect);
        
        if (isCorrect) {
            correctAnswers++;
        } else {
            incorrectAnswers++;
            message += "\nThe correct answer was number " + correctAnswer;
        }
        
        JOptionPane.showMessageDialog(null, message);
        
	}
	
	public String generateMessage(boolean isCorrect) {
	    Random random = new Random();
	    int messageIndex = random.nextInt(4);

	    String message;
	    switch (messageIndex) {
	        case 0:
	            message = isCorrect ? "Excellent!" : "No. Please try again.";
	            break;
	        case 1:
	            message = isCorrect ? "Good!" : "Wrong. Try once more.";
	            break;
	        case 2:
	            message = isCorrect ? "Keep up the good work!" : "Don't give up!";
	            break;
	        case 3:
	            message = isCorrect ? "Nice work!" : "No. Keep trying..";
	            break;
	        default:
	            message = isCorrect ? "Well done!" : "Incorrect.";
	            break;
	    }
	    return message;
	}

    public void inputAnswer() {
        for (int i = 0; i < questions.length; i++) simulateQuestion(i);

        double percentageCorrect = ((double) correctAnswers / questions.length) * 100;
        JOptionPane.showMessageDialog(null, "Test completed\nCorrect Answers: " + correctAnswers
                + "\nIncorrect Answers: " + incorrectAnswers + "\nPercentage: " + String.format("%.2f", percentageCorrect) + "%");
    }

	public static void main(String[] args) {		
        Test test = new Test();
        test.inputAnswer();	

	}

}
