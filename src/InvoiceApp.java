import java.util.*;
import java.util.stream.*;

class Invoice {
    String id;

    Invoice(String id) {
        this.id = id;
    }

    public String toString() {
        return "Invoice ID: " + id;
    }
}

public class InvoiceApp {
    public static void main(String[] args) {

        List<String> transactionIds = Arrays.asList("T101", "T102", "T103", "T104");

        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
