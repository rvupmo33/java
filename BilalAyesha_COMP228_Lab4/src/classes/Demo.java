package classes;
import java.util.Random;

class BankAccount{
	int balance;
	
    public BankAccount(int initialBalance) {
        balance = initialBalance;
    }
	
	public synchronized void deposit(int amount) {
		balance += amount; // Got 'currentThread().getName()' while searching about the setName method
		System.out.println(Thread.currentThread().getName() +" deposited: $" + amount + " | Balance: " + balance);
	}
	
	public synchronized void withdraw(int amount) {
		if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrawed: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Insufficient funds | Balance: " + balance);
        }

	}
	
}

class AccountUser implements Runnable{
	BankAccount account;
	Random r = new Random();
	
    public AccountUser(BankAccount userAccount) {
        account = userAccount;
    }

	 public void run() {
		 account.deposit(r.nextInt(100) + 1); 
	     account.withdraw(r.nextInt(1000) + 1);
	 }
}

public class Demo {

	public static void main(String[] args) {
		 BankAccount account = new BankAccount(700);

        for (int i = 1; i < 6; i++) {
        	AccountUser acc = new AccountUser(account);
        	
            Thread T = new Thread(acc);
            
            T.setName("user" + i);
            T.start();
        }

	}

}
