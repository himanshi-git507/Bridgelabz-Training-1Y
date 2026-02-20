import java.util.*;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;
    private double loanAmount;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            loanAmount = amount;
            System.out.println("Loan approved for Savings Account: " + amount);
        } else {
            System.out.println("Loan not approved for Savings Account");
        }
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 5000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;
    private double loanAmount;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double calculateInterest() {
        return getBalance() * 2 / 100;
    }

    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            loanAmount = amount;
            System.out.println("Loan approved for Current Account: " + amount);
        } else {
            System.out.println("Loan not approved for Current Account");
        }
    }

    public boolean calculateLoanEligibility() {
        return getBalance() + overdraftLimit > 10000;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SAV001", "Amit", 10000, 4));
        accounts.add(new CurrentAccount("CUR001", "Riya", 8000, 5000));

        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Holder Name: " + account.getHolderName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Interest: " + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loan = (Loanable) account;
                loan.applyForLoan(5000);
            }

            System.out.println("---------------------------");
        }
    }
}
