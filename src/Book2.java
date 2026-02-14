public class Book2 {
    String title;
    String author;
    double price;
    boolean availability;

    public Book() {
        title = "";
        author = "";
        price = 0.0;
        availability = true;
    }

    public Book(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + availability);
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 250.0, true);
        book1.displayBook();
        System.out.println();
        book1.borrowBook();
        book1.displayBook();
        System.out.println();
        book1.borrowBook();
    }
}
