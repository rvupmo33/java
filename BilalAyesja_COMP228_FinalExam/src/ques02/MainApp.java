package ques02;
import java.util.Scanner;

public class MainApp {
	
	public static class MarksException extends Exception {
	    private float marks;

	    public MarksException(float marks) {
	        this.marks = marks;
	    }

	    public float getMarks() {
	        return marks;
	    }
	}
	

	public static class Student {
	    private int id;
	    private String name;
	    private float[] marks;
	    private int noOfSubjects;

	    public Student(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public float inputMarks(int index) throws MarksException {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter marks for subject " + index + ": ");
	        float mark = scanner.nextFloat();
	        if (mark < 0 || mark > 100) {
	            throw new MarksException(mark);
	        }
	        return mark;
	    }

	    public void input() {
	        Scanner scanner = new Scanner(System.in);
	        try {
	            System.out.print("Enter number of subjects: ");
	            noOfSubjects = scanner.nextInt();
	            marks = new float[noOfSubjects];

	            for (int i = 0; i < noOfSubjects; i++) {
	                marks[i] = inputMarks(i + 1);
	            }
	        } catch (MarksException e) {
	            System.out.println("Invalid marks: " + e.getMarks());
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }

	    public float getAverage() {
	        if (noOfSubjects == 0) {
	            return 0;
	        }

	        float sum = 0;
	        for (float mark : marks) {
	            sum += mark;
	        }
	        return sum / noOfSubjects;
	    }
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Student student = new Student(1, "John Doe");
	        student.input();
	        float average = student.getAverage();
	        System.out.println("Average marks: " + average);

	}

}
