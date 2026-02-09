import java.util.Scanner;

public class BMICalculation {

    public static String[][] calculateBMIStatus(double weight, double heightCm) {
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[][]{
                {String.format("%.2f", bmi), status}
        };
    }

    public static String[][] processBMI(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];

            String[][] bmiData = calculateBMIStatus(weight, height);

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiData[0][0];
            result[i][3] = bmiData[0][1];
        }

        return result;
    }

    public static void displayResult(String[][] data) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1] + "\t\t" + data[i][2] + "\t" + data[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] persons = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) and height (cm) for person " + (i + 1));
            persons[i][0] = sc.nextDouble();
            persons[i][1] = sc.nextDouble();
        }

        String[][] result = processBMI(persons);
        displayResult(result);
    }
}
