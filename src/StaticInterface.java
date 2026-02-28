import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*[0-9].*") &&
                password.matches(".*[@#$%^&+=].*");
    }
}

interface UnitConverter {
    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }
}

interface DateFormatUtil {
    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

public class StaticInterface {
    public static void main(String[] args) {

        String password = "Secure@123";
        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Password is strong");
        } else {
            System.out.println("Password is weak");
        }

        double km = 10;
        double kg = 5;
        System.out.println(km + " km in miles: " + UnitConverter.kmToMiles(km));
        System.out.println(kg + " kg in lbs: " + UnitConverter.kgToLbs(kg));

        LocalDate today = LocalDate.now();
        System.out.println("Formatted Date (dd-MM-yyyy): " + DateFormatUtil.formatDate(today, "dd-MM-yyyy"));
        System.out.println("Formatted Date (yyyy/MM/dd): " + DateFormatUtil.formatDate(today, "yyyy/MM/dd"));
    }
}
