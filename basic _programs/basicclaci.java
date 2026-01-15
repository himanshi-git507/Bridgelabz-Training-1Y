import java.util.Scanner;

public class BasicCalci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = sc.nextDouble();
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division;
        if (number2 != 0) {
            division = number1 / number2;
        } else {
            division = Double.NaN; // Not a number
        }
        System.out.printf("Addition: %.2f%n", addition);
        Syst
