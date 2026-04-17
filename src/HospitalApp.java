import java.util.*;
import java.util.function.Predicate;

class Alert {
    String message;
    String type;
    int priority;

    Alert(String message, String type, int priority) {
        this.message = message;
        this.type = type;
        this.priority = priority;
    }

    public String toString() {
        return message + " | Type: " + type + " | Priority: " + priority;
    }
}

public class HospitalApp {
    public static void main(String[] args) {

        List<Alert> alerts = new ArrayList<>();

        alerts.add(new Alert("Heart rate high", "CRITICAL", 5));
        alerts.add(new Alert("Medicine reminder", "GENERAL", 2));
        alerts.add(new Alert("Low oxygen level", "CRITICAL", 4));
        alerts.add(new Alert("Appointment scheduled", "INFO", 1));

        Predicate<Alert> criticalOnly = a -> a.type.equals("CRITICAL");
        Predicate<Alert> highPriority = a -> a.priority >= 4;

        System.out.println("Critical Alerts:");
        alerts.stream().filter(criticalOnly).forEach(System.out::println);

        System.out.println("\nHigh Priority Alerts:");
        alerts.stream().filter(highPriority).forEach(System.out::println);

        System.out.println("\nCritical + High Priority Alerts:");
        alerts.stream().filter(criticalOnly.and(highPriority)).forEach(System.out::println);
    }
}
