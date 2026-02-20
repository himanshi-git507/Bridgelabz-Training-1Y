class Account {

    private String accountHolder;

    public Account(String accountHolder) {
        this.accountHolder = accountHolder;
        initialize();
    }

    private void initialize() {
        System.out.println("Account created for: " + accountHolder);
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}

class SavingsAccount extends Account {

    private double balance;

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("Himanshi", 10000);
        System.out.println("Balance: " + account.getBalance());
    }
}
