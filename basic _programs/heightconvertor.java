import java.util.Scanner;

import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {

        double heightCm;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble();

        // Convert cm to inches
        double totalInches = heightCm / 2.54;

        // Convert inches to feet and remaining inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println(
                "Your Height in cm is " + heightCm +
                " while in feet is " + feet +
                " and inches is " + inches
        );
    }
}
