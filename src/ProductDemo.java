import java.util.*;

class Product {
    protected double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Mobile extends Product {
    public Mobile(double price) {
        super(price);
    }

    public String toString() {
        return "Mobile: " + price;
    }
}

class Laptop extends Product {
    public Laptop(double price) {
        super(price);
    }

    public String toString() {
        return "Laptop: " + price;
    }
}

class PriceUtil {
    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product p : items) {
            total += p.getPrice();
        }
        return total;
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        List<Mobile> mobiles = Arrays.asList(new Mobile(10000), new Mobile(20000));
        List<Laptop> laptops = Arrays.asList(new Laptop(50000), new Laptop(70000));

        System.out.println(PriceUtil.calculateTotal(mobiles));
        System.out.println(PriceUtil.calculateTotal(laptops));
    }
}
