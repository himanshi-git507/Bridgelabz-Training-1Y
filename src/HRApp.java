import java.util.*;
import java.util.stream.*;

public class HRApp {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("rahul", "sneha", "amit", "neha");

        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        upperNames.forEach(System.out::println);
    }
}
