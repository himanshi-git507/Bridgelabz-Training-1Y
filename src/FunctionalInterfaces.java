import java.util.function.Predicate;
import java.util.function.Function;

public class FunctionalInterfaces {

    public static void main(String[] args) {

        Predicate<Double> temperatureAlert = temp -> temp > 40.0;
        double currentTemp = 45.5;
        if (temperatureAlert.test(currentTemp)) {
            System.out.println("Alert: Temperature crossed threshold!");
        } else {
            System.out.println("Temperature is normal.");
        }

        Function<String, Integer> stringLengthChecker = message -> message.length();
        String msg = "Hello Functional Interfaces";
        int length = stringLengthChecker.apply(msg);
        if (length > 20) {
            System.out.println("Message exceeds character limit. Length: " + length);
        } else {
            System.out.println("Message within limit. Length: " + length);
        }

        Runnable backgroundJob = () -> {
            System.out.println("Background job started...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Job interrupted");
            }
            System.out.println("Background job completed.");
        };

        Thread thread = new Thread(backgroundJob);
        thread.start();
    }
}
