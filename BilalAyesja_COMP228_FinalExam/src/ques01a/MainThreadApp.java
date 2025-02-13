package ques01a;

public class MainThreadApp {
	
	public static class CountDown extends Thread {
	    public void run() {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(i);
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                System.out.println(e);
	            }
	        }
	    }
	}
	
	public static class CalcSum implements Runnable {
	    public void run() {
	        long sum = 0;
	        for (int i = 1; i <= 100000; i++) {
	            sum += i;
	        }
	        System.out.println("Sum: " + sum);
	        System.out.println("Thread name: " + Thread.currentThread().getName());
	    }
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountDown countDown = new CountDown();
		
		Thread blackThread = new Thread(new CalcSum());
        blackThread.setName("Black");

        Thread whiteThread = new Thread(new CalcSum());
        whiteThread.setName("White");

        countDown.start();

        try {
            countDown.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        blackThread.start();
        whiteThread.start();
        
        
	}

}
