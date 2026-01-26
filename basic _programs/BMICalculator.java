import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 
        System.out.print("Enter weight (in kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter height (in cm): ");
        double heightCm = sc.nextDouble();

    
        if (weight <= 0 || heightCm <= 0) {
            System.out.println("Error: Weight and height must be positive values.");
        } else {
            
            double heightMeter = heightCm / 100;

        
            double bmi = weight / (heightMeter * heightMeter);

        
            System.out.println("\n--- BMI Report ---");
            System.out.println("Weight: " + weight + " kg");
            System.out.println("Height: " + heightMeter + " m");
            System.out.println("BMI: " + bmi);
        }

        sc.close();
    }
}
