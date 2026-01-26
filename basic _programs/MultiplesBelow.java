import java.util.Scanner;

public class import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        // Check if the number is valid
        if (number <= 0 || number >= 100) {
            System.out.println("Error: Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");

            // Loop backward from 100 to 1
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) { // Check if i is a multiple of number
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

      
        if (number <= 0 || number >= 100) {
            System.out.println("Error: Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");

         
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) { 
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
