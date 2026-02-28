class Product {
    int productId;
    String productName;

    Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    boolean isMatch(String keyword) {
        return productName.toLowerCase().contains(keyword.toLowerCase());
    }
}

class ElectronicProduct extends Product {
    String brand;

    ElectronicProduct(int productId, String productName, String brand) {
        super(productId, productName);
        this.brand = brand;
    }

    boolean isMatch(String keyword) {
        return productName.toLowerCase().contains(keyword.toLowerCase()) ||
                brand.equalsIgnoreCase(keyword);
    }
}

public class ECommerceProductCategorization {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Office Chair");
        Product p2 = new ElectronicProduct(102, "Smartphone", "Samsung");

        System.out.println(p1.isMatch("chair"));
        System.out.println(p2.isMatch("smart"));
        System.out.println(p2.isMatch("Samsung"));
    }
}
