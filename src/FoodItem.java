import java.util.*;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    protected double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }

    protected void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - discount;
    }

    public void applyDiscount(double percentage) {
        double total = getPrice() * getQuantity();
        discount = total * percentage / 100;
    }

    public String getDiscountDetails() {
        return "Veg Item Discount Applied: " + discount;
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private double extraCharge = 50;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        double total = (getPrice() * getQuantity()) + extraCharge;
        return total - discount;
    }

    public void applyDiscount(double percentage) {
        double total = (getPrice() * getQuantity()) + extraCharge;
        discount = total * percentage / 100;
    }

    public String getDiscountDetails() {
        return "Non-Veg Item Discount Applied: " + discount;
    }
}

public class FoodDeliverySystem {
    public static void processOrder(List<FoodItem> items) {
        for (FoodItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Total Price: " + item.calculateTotalPrice());

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                d.applyDiscount(10);
                System.out.println(d.getDiscountDetails());
                System.out.println("Price After Discount: " + item.calculateTotalPrice());
            }

            System.out.println("-------------------------");
        }
    }

    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Butter Masala", 250, 2));
        order.add(new NonVegItem("Chicken Biryani", 300, 1));

        processOrder(order);
    }
}
