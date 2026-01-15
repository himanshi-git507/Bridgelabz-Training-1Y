import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        double number1;
        double number2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        number2 = input.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println(
                "The addition, subtraction, multiplication and division value of 2 numbers "
                + number1 + " and " + number2 +
                "\nAddition = " + addition +
                "\nSubtraction = " + subtraction +
                "\nMultiplication = " + multiplication +
                "\nDivision = " + division
        );

        input.close();
    }
}
