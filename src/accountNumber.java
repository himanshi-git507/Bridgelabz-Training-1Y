class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount() {
        accountNumber = "";
        accountHolder = "";
        balance = 0.0;
    }

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class accountNumber {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("ACC12345", "Himanshi Soni", 50000.0);
        acc1.displayAccountDetails();
        System.out.println();

        SavingsAccount savAcc = new SavingsAccount("ACC67890", "Rohit Sharma", 75000.0, 4.5);
        savAcc.displaySavingsDetails();
    }
}
