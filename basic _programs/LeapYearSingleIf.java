import java.util.Scanner;

public class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Single if statement with logical operators
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0))
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");

        sc.close();
    }
}
