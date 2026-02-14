public class ZaraBonus {

    public static double[][] generateEmployeeData(int size) {
        double[][] data = new double[size][2];
        for (int i = 0; i < size; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000;
            data[i][1] = (int)(Math.random() * 11);
        }
        return data;
    }

    public static double[][] calculateNewSalaryAndBonus(double[][] data) {
        double[][] result = new double[data.length][3];
        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonusRate = years > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;
            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }
        return result;
    }

    public static void displaySummary(double[][] result) {
        double totalOld = 0;
        double totalNew = 0;
        double totalBonus = 0;

        System.out.printf("%10s %15s %15s\n", "Old Salary", "Bonus", "New Salary");

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%10.2f %15.2f %15.2f\n",
                    result[i][0], result[i][1], result[i][2]);
            totalOld += result[i][0];
            totalBonus += result[i][1];
            totalNew += result[i][2];
        }

        System.out.println("-----------------------------------------------------");
        System.out.printf("%10.2f %15.2f %15.2f\n", totalOld, totalBonus, totalNew);
    }

    public static void main(String[] args) {
        double[][] data = generateEmployeeData(10);
        double[][] result = calculateNewSalaryAndBonus(data);
        displaySummary(result);
    }
}