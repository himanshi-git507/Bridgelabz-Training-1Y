public class BankTransaction {

    public static double getRemainingLimit(Double limit, double withdrawn) {
        if (limit == null) {
            return 0.0;
        }
        return limit - withdrawn;
    }

    public static void main(String[] args) {
        Double limit1 = 5000.0;
        Double limit2 = null;

        System.out.println("Remaining limit: " + getRemainingLimit(limit1, 1500.0));
        System.out.println("Remaining limit: " + getRemainingLimit(limit2, 1500.0));
    }
}
