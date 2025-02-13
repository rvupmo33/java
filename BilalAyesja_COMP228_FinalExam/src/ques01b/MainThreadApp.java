package ques01b;

public class MainThreadApp {
	
    public static class Calculation {
        private double ans = 1;

        public double getAns() {
            return ans;
        }

        public synchronized void multiply(double value) {
            ans *= value;
        }

        public double computePartialFactorial(int start, int end) {
            double result = 1;
            for (int i = start; i <= end; i++) {
                result *= i;
            }
            return result;
        }
    }

	
	public class MarksException extends Exception {
	    private float marks;

	    public MarksException(float marks) {
	        this.marks = marks;
	    }

	    public float getMarks() {
	        return marks;
	    }
	}
	
    public static class ParallelThread extends Thread {
        private Calculation myCalc;
        private int start;
        private int end;

        public ParallelThread(Calculation myCalc, int start, int end) {
            this.myCalc = myCalc;
            this.start = start;
            this.end = end;
        }

        public void run() {
            double partialResult = myCalc.computePartialFactorial(start, end);
            myCalc.multiply(partialResult);
        }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Calculation calc = new Calculation();

	    ParallelThread t1 = new ParallelThread(calc, 1, 10);
        ParallelThread t2 = new ParallelThread(calc, 11, 20);
        ParallelThread t3 = new ParallelThread(calc, 21, 30);
        ParallelThread t4 = new ParallelThread(calc, 31, 40);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Factorial of 40: " + calc.getAns());
	}

}
