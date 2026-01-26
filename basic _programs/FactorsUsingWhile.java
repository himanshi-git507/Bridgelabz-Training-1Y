import java.util.Scanner;

public class FactorsUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a positive integer: ");
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");

            int counter = 1; 

            
            while (counter <= number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++; 
            }
        }

        sc.close();
    }
}
