import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        double base, height;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of the triangle (in inches): ");
        base = input.nextDouble();

        System.out.print("Enter height of the triangle (in inches): ");
        height = input.nextDouble();

        // Area in square inches
        double areaInches = 0.5 * base * height;

        // Convert square inches to square centimeters
        // 1 inch = 2.54 cm → 1 sq inch = 2.54 × 2.54 = 6.4516 sq cm
        double areaCm = areaInches * 6.4516;

        System.out.println(
                "The area of triangle in square inches is " + areaInches +
                " and in square centimeters is " + areaCm
        );

        input.close();
    }
}
