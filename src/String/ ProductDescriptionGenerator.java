import java.util.Arrays;

public class ProductDescriptionGenerator {

    static class Product {
        String title;
        String sku;
        String category;
        String brand;
        String model;
        String[] specifications;
        String[] features;
        double rating;
        int reviewCount;
        double originalPrice;
        double discount;
        boolean availability;

        Product(String title, String sku, String category, String brand, String model,
                String[] specifications, String[] features, double rating, int reviewCount,
                double originalPrice, double discount, boolean availability) {
            this.title = title;
            this.sku = sku;
            this.category = category;
            this.brand = brand;
            this.model = model;
            this.specifications = specifications;
            this.features = features;
            this.rating = rating;
            this.reviewCount = reviewCount;
            this.originalPrice = originalPrice;
            this.discount = discount;
            this.availability = availability;
        }
    }

    static StringBuilder buildTitleAndSKU(Product p) {
        StringBuilder sb = new StringBuilder();
        sb.append("<h1>").append(p.title).append("</h1>\n");
        sb.append("<p>SKU: ").append(p.sku).append(" (Verification: ")
                .append(new StringBuilder(p.sku).reverse()).append(")</p>\n");
        return sb;
    }

    static StringBuilder buildBasicInfo(Product p) {
        StringBuilder sb = new StringBuilder();
        sb.append("<p>Category: ").append(p.category).append("</p>\n");
        sb.append("<p>Brand: ").append(p.brand).append("</p>\n");
        sb.append("<p>Model: ").append(p.model).append("</p>\n");
        return sb;
    }

    static StringBuilder buildSpecifications(Product p) {
        StringBuilder sb = new StringBuilder();
        sb.append("<h2>Specifications</h2>\n<ul>\n");
        for (String spec : p.specifications) {
            sb.append("<li>").append(spec).append("</li>\n");
        }
        sb.append("</ul>\n");
        return sb;
    }

    static StringBuilder buildFeatures(Product p) {
        StringBuilder sb = new StringBuilder();
        sb.append("<h2>Features</h2>\n<ul>\n");
        for (String feature : p.features) {
            sb.append("<li>").append(feature).append("</li>\n");
        }
        sb.append("</ul>\n");
        return sb;
    }

    static StringBuilder buildCustomerRating(Product p) {
        StringBuilder sb = new StringBuilder();
        sb.append("<p>Customer Rating: ").append(p.rating).append(" / 5 (")
                .append(p.reviewCount).append(" reviews)</p>\n");
        return sb;
    }

    static StringBuilder buildPricing(Product p) {
        StringBuilder sb = new StringBuilder();
        double finalPrice = p.originalPrice * (1 - p.discount / 100);
        sb.append("<p>Original Price: $").append(p.originalPrice).append("</p>\n");
        sb.append("<p>Discount: ").append(p.discount).append("%</p>\n");
        sb.append("<p>Final Price: $").append(String.format("%.2f", finalPrice)).append("</p>\n");
        return sb;
    }

    static StringBuilder buildAvailability(Product p) {
        StringBuilder sb = new StringBuilder();
        sb.append("<p>Availability: ").append(p.availability ? "In Stock" : "Out of Stock").append("</p>\n");
        return sb;
    }

    static StringBuilder insertBanner(StringBuilder sb, String bannerMessage) {
        sb.append("<div class='promo'>").append(bannerMessage).append("</div>\n");
        return sb;
    }

    static StringBuilder replaceKeywords(StringBuilder sb) {
        String result = sb.toString().replaceAll("cheap", "affordable");
        return new StringBuilder(result);
    }

    static int calculateReadingTime(StringBuilder sb) {
        String text = sb.toString().replaceAll("<[^>]*>", " ");
        String[] words = text.trim().split("\\s+");
        return (int) Math.ceil(words.length / 200.0);
    }

    static StringBuilder buildFullDescription(Product p) {
        StringBuilder sb = new StringBuilder();
        sb.append(buildTitleAndSKU(p));
        sb.append(buildBasicInfo(p));
        sb.append(insertBanner(sb, "Limited Time Offer!"));
        sb.append(buildSpecifications(p));
        sb.append(buildFeatures(p));
        sb.append(buildCustomerRating(p));
        sb.append(buildPricing(p));
        sb.append(buildAvailability(p));
        sb = replaceKeywords(sb);
        return sb;
    }

    public static void main(String[] args) {
        Product[] products = new Product[3];

        products[0] = new Product(
                "UltraLaptop X200", "LX200-123", "Electronics", "TechBrand", "X200",
                new String[]{"Intel i7", "16GB RAM", "512GB SSD", "15.6 inch FHD", "Battery 10h"},
                new String[]{"Lightweight design", "Backlit keyboard", "High performance", "WiFi 6"},
                4.5, 120, 1500, 10, true
        );

        products[1] = new Product(
                "WinterJacket Pro", "WJPRO-456", "Clothing", "FashionCo", "Pro2023",
                new String[]{"Waterproof", "Insulated", "Hooded", "Windproof", "Machine washable"},
                new String[]{"Comfortable fit", "Lightweight", "Durable zippers", "Affordable pricing"},
                4.2, 85, 200, 15, true
        );

        products[2] = new Product(
                "CoffeeMaster 3000", "CM3000-789", "Home Appliances", "HomeEase", "CM3000",
                new String[]{"1000W Power", "1L Capacity", "Auto shut-off", "Stainless steel", "Easy clean"},
                new String[]{"Fast brewing", "Compact design", "Energy efficient", "Affordable price"},
                4.7, 60, 120, 20, false
        );

        for (Product p : products) {
            StringBuilder desc = buildFullDescription(p);
            System.out.println(desc.toString());
            System.out.println("Total Description Length: " + desc.length());
            System.out.println("Estimated Reading Time: " + calculateReadingTime(desc) + " min\n");
        }
    }
}
