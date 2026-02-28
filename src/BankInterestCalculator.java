class Account {
    int accountNumber;
    double balance;
    static String bankName = "National Bank";

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    double calculateInterest() {
        return 0;
    }
}

class SavingsAccount extends Account {
    SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    double calculateInterest() {
        return balance * 0.04;
    }
}

class CurrentAccount extends Account {
    CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    double calculateInterest() {
        return balance * 0.02;
    }
}

public class BankInterestCalculator {
    public static void main(String[] args) {
        Account a1 = new SavingsAccount(101, 10000);
        Account a2 = new CurrentAccount(102, 10000);

        System.out.println("Bank: " + Account.bankName);
        System.out.println("Savings Interest: ₹" + a1.calculateInterest());
        System.out.println("Current Interest: ₹" + a2.calculateInterest());
    }
}
