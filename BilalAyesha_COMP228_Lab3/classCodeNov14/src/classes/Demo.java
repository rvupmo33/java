package classes;

//class Database extends Thread Student{
//	
//	public void run() {
//		for(int i=0;i<5;i++) {
//			System.out.println("Updating DB");
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			Test();
//			Test2();
//		}
//		
//	}
//	
//	void Test() {
//		
//	}
//	
//	void Test2() {
//		
//	}
//	
//}

class Star extends Thread{
	synchronized static void printStar(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}

class Database implements Runnable{
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Updating DB");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Test();
			Test2();
		}
		
	}
	
	void Test() {
		
	}
	
	void Test2() {
		
	}
	
}

class Number extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Printing Number: " + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		Runnable db = new Database();
//		Number no = new Number();
//		
//		Thread T = new Thread(db);
//		
//		T.setPriority(Thread.MAX_PRIORITY);
//		T.setPriority(Thread.MIN_PRIORITY);
//		
//		T.start();
//		no.start();
//		
//		T.setName("DB Thread");
//		no.setName("Number Thread");
//		
//		System.out.println(T.getPriority());
//		System.out.println(no.getPriority());
		
		
		// Lambda expression method
		Star s1 = new Star();
		Thread t1 = new Thread() {
			public void run() {
				s1.printStar(6);
			}
		};
		Thread t2 = new Thread() 
			{
				public void run() {
					s1.printStar(5);
				}
			};
		
		t1.start();
		t2.start();
	
		
		
//		Database db = new Database();
//		Number no = new Number();
//
//		db.start();
//		no.start();
//		if (db.isAlive()) {
//			System.out.println("Db is still executing...");
//		}
//		db.join();
//		System.out.println("Bye...");
//		if (!db.isAlive()) {
//			System.out.println("Db thread is not alive...");
//		}
		
	}

}
