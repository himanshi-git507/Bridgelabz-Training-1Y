import java.util.Scanner;

public class BMICalculator {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightInMeters = data[i][1] / 100.0;
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters);
        }
    }

    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi < 18.5)
                status[i] = "Underweight";
            else if (bmi >= 18.5 && bmi < 25)
                status[i] = "Normal weight";
            else if (bmi >= 25 && bmi < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        calculateBMI(data);
        String[] status = getBMIStatus(data);

        for (int i = 0; i < 10; i++) {
            System.out.println("Weight: " + data[i][0] +
                    " Height: " + data[i][1] +
                    " BMI: " + data[i][2] +
                    " Status: " + status[i]);
        }
    }
}