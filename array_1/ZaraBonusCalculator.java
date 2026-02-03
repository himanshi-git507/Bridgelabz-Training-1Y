 import java.util.Scanner;

public class ZaraBonusCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int employees = 10;

   
        double[] salary = new double[employees];
        double[] years = new double[employees];

     
        double[] bonus = new double[employees];
        double[] newSalary = new double[employees];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        
        for (int i = 0; i < employees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Years of Service: ");
            years[i] = sc.nextDouble();

            
            if (salary[i] <= 0 || years[i] < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--;
            }
        }

   
        for (int i = 0; i < employees; i++) {

            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05; 
            } else {
                bonus[i] = salary[i] * 0.02; 
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

   
        System.out.println("\n--- Zara Bonus Summary ---");
        System.out.println("Total Old Salary  = " + totalOldSalary);
        System.out.println("Total Bonus Paid = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close();
    }
}
 