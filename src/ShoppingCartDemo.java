import java.util.*;

public class ShoppingCartDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> cart = new LinkedHashMap<>();

        cart.put("Laptop", 40000.0);
        cart.put("Headphones", 2000.0);
        cart.put("Mouse", 500.0);
        cart.put("Keyboard", 1500.0);

        System.out.println("Products in Cart:");
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        double total = 0;
        for (double price : cart.values()) {
            total += price;
        }

        if (total > 5000) {
            total = total * 0.9;
        }

        System.out.println("\nTotal Bill: " + total);

        cart.remove("Mouse");

        System.out.println("\nCart after removal:");
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
