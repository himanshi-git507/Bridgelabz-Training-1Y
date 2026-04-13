import java.util.*;

public class BankDemo {
    public static void main(String[] args) {
        HashMap<String, Double> accounts = new HashMap<>();

        addAccount(accounts, "A1", 5000);
        addAccount(accounts, "A2", 12000);
        addAccount(accounts, "A3", 8000);
        addAccount(accounts, "A4", 15000);

        deposit(accounts, "A1", 2000);
        withdraw(accounts, "A2", 5000);
        withdraw(accounts, "A3", 9000);

        List<Map.Entry<String, Double>> list = new ArrayList<>(accounts.entrySet());
        list.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        System.out.println("Customers sorted by balance:");
        for (Map.Entry<String, Double> entry : list) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nTop 3 customers:");
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            System.out.println(list.get(i).getKey() + " - " + list.get(i).getValue());
        }
    }

    public static void addAccount(HashMap<String, Double> map, String accNo, double balance) {
        map.put(accNo, balance);
    }

    public static void deposit(HashMap<String, Double> map, String accNo, double amount) {
        map.put(accNo, map.getOrDefault(accNo, 0.0) + amount);
    }

    public static void withdraw(HashMap<String, Double> map, String accNo, double amount) {
        double balance = map.getOrDefault(accNo, 0.0);
        if (balance >= amount) {
            map.put(accNo, balance - amount);
        } else {
            System.out.println("Insufficient balance for account: " + accNo);
        }
    }
}
