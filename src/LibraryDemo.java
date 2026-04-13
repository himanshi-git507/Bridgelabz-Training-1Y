import java.util.*;

class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }

    public String toString() {
        return title;
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        List<Book> allBooks = new ArrayList<>();
        allBooks.add(new Book("Java Basics"));
        allBooks.add(new Book("Data Structures"));
        allBooks.add(new Book("Operating Systems"));

        Set<String> members = new HashSet<>();
        registerMember(members, "M1");
        registerMember(members, "M2");
        registerMember(members, "M1");

        Queue<Book> issueQueue = new LinkedList<>();
        issueQueue.add(allBooks.get(0));
        issueQueue.add(allBooks.get(1));

        Stack<Book> returnedStack = new Stack<>();

        while (!issueQueue.isEmpty()) {
            Book issued = issueQueue.poll();
            System.out.println("Issued: " + issued);
            returnedStack.push(issued);
        }

        System.out.println("\nRe-issuing recently returned book:");
        if (!returnedStack.isEmpty()) {
            Book reissue = returnedStack.pop();
            System.out.println("Re-issued: " + reissue);
        }
    }

    public static void registerMember(Set<String> members, String id) {
        if (!members.add(id)) {
            System.out.println("Duplicate member ID: " + id);
        }
    }
}
