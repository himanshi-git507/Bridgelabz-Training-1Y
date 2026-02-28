class Book {
    int bookId;
    String title;
    double price;
    static String libraryName = "Smart City Library";

    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    double calculateFine(int daysLate) {
        return 0;
    }
}

class TextBook extends Book {
    TextBook(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    double calculateFine(int daysLate) {
        return daysLate * 2;
    }
}

class Magazine extends Book {
    Magazine(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    double calculateFine(int daysLate) {
        return daysLate * 5;
    }
}

public class SmartLibrarySystem {
    public static void main(String[] args) {
        Book b1 = new TextBook(101, "Physics", 500);
        Book b2 = new Magazine(201, "Tech Today", 150);

        System.out.println("Library: " + Book.libraryName);
        System.out.println("Fine for TextBook (5 days): ₹" + b1.calculateFine(5));
        System.out.println("Fine for Magazine (5 days): ₹" + b2.calculateFine(5));
    }
}
