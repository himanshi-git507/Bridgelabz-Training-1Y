import java.util.Scanner;

public class VotingCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Define an array of 10 integer elements
        int[] age = new int[10];

        // Take user input for ages
        System.out.println("Enter the age of 10 students:");
        for (int i = 0; i < age.length; i++) {
            age[i] = sc.nextInt();
        }

        // b. Loop through the array and check voting eligibility
        for (int i = 0; i < age.length; i++) {

            if (age[i] < 0) {
                System.out.println("Invalid age");
            } 
            else if (age[i] >= 18) {
                System.out.println("The student with the age " + age[i] + " can vote.");
            } 
            else {
                System.out.println("The student with the age " + age[i] + " cannot vote.");
            }
        }

        sc.close();
    }
}
