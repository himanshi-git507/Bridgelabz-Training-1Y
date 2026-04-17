import java.util.*;
import java.util.stream.*;
import java.time.*;

class Member {
    String name;
    LocalDate expiryDate;

    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public String toString() {
        return name + " | Expiry: " + expiryDate;
    }
}

public class GymApp {
    public static void main(String[] args) {

        List<Member> members = Arrays.asList(
                new Member("Rahul", LocalDate.now().plusDays(10)),
                new Member("Sneha", LocalDate.now().plusDays(40)),
                new Member("Amit", LocalDate.now().plusDays(25)),
                new Member("Neha", LocalDate.now().plusDays(5))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        List<Member> expiringSoon = members.stream()
                .filter(m -> !m.expiryDate.isBefore(today) && !m.expiryDate.isAfter(next30Days))
                .collect(Collectors.toList());

        expiringSoon.forEach(System.out::println);
    }
}
