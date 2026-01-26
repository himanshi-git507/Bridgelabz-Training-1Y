import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

     
        System.out.print("Enter your years of service: ");
        int years = sc.nextInt();

        
        double bonus = 0;

       
        if (years > 5) {
            bonus = salary * 0.05; // 5% bonus
            System.out.println("Congratulations! You are eligible for a bonus.");
        } else {
            System.out.println("Sorry! You are not eligible for a bonus.");
        }

     
        if (bonus > 0) {
            System.out.println("Your bonus amount is: " + bonus);
        }

        sc.close();
    }
}
