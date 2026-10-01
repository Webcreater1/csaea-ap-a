package Practice;

public class BankTester {
    public static void main(String[] args) {
	
		BankAccount b1 = new BankAccount("Alex", 100.00);
      BankAccount b2 = new BankAccount("Jamie", 250.00);
	
	   b1.deposit(50.00);
	   b1.printInfo();
      b2.printInfo();

    }

}

class BankAccount {
   private String owner;
   private double balance;
 
   public BankAccount(String o, double b) {
      owner = o;
      balance = b;
   }
 
   public void deposit(double amount) {
      balance = balance + amount;
   }
 
   public void printInfo() {
      System.out.println(owner + " — Balance: $" + balance);
   }
}
