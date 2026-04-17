import java.util.*;
import java.util.stream.*;

public class CustomerApp {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("rahul", "sneha", "amit", "neha");

        List<String> result = names.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
