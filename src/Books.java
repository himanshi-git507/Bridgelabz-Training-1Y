public class Book {
    private String title;
    private String author;
    private int bookId;
    private boolean isIssued;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public void issueBook() {
        isIssued = true;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Issued: " + isIssued);
    }
}

library/members/Member.java
package library.members;

public class Member {
    private int memberId;
    private String name;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public void displayMember() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + name);
    }
}

library/transactions/Transaction.java
package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {
    private Book book;
    private Member member;

    public Transaction(Book book, Member member) {
        this.book = book;
        this.member = member;
    }

    public void issue() {
        if (!book.isIssued()) {
            book.issueBook();
            System.out.println("Book issued successfully to " + member.getName());
        } else {
            System.out.println("Book is already issued");
        }
    }
}

Main.java
import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class Main {
    public static void main(String[] args) {
        Book book = new Book(1, "Java Programming", "James Gosling");
        Member member = new Member(101, "Himanshi");

        book.displayBook();
        member.displayMember();

        Transaction transaction = new Transaction(book, member);
        transaction.issue();

        book.displayBook();
    }
}
