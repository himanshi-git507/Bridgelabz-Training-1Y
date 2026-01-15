import java.util.Scanner;

public class feet {
    public static void main(String[] args) {

        double distanceInFeet;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        distanceInFeet = input.nextDouble();

        // Convert feet to yards
        double yards = distanceInFeet / 3;

        // Convert yards to miles
        double miles = yards / 1760;

        System.out.println(
                "The distance in feet is " + distanceInFeet +
                " while in yards is " + yards +
                " and in miles is " + miles
        );

        input.close();
    }
}

