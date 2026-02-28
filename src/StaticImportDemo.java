public class StaticImportDemo {
    public static void main(String[] args) {
        double number = 25;
        double squareRoot = sqrt(number);
        double powerValue = pow(2, 3);
        int maximum = max(10, 20);
        int minimum = min(5, 3);
        int absoluteValue = abs(-15);

        System.out.println("Square Root: " + squareRoot);
        System.out.println("Power: " + powerValue);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("Absolute Value: " + absoluteValue);
    }
}
