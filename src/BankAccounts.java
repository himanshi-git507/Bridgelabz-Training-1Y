class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public final void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        }
    }

    public final void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    public void addInterest() {
        double interest = getBalance() * 0.05;
        deposit(interest);
    }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(1000);
        account.deposit(500);
        account.withdraw(200);
        account.addInterest();
        System.out.println("Final Balance: " + account.getBalance());
    }
}
