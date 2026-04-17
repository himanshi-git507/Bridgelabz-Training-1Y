import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " | Price: " + price + " | Rating: " + rating + " | Discount: " + discount + "%";
    }
}

public class ECommerceApp {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 80000, 4.5, 10));
        products.add(new Product("Phone", 30000, 4.7, 15));
        products.add(new Product("Headphones", 2000, 4.2, 20));
        products.add(new Product("Smartwatch", 5000, 4.6, 5));

        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("Sort by Price:");
        products.forEach(System.out::println);

        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("\nSort by Rating:");
        products.forEach(System.out::println);

        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        System.out.println("\nSort by Discount:");
        products.forEach(System.out::println);
    }
}
