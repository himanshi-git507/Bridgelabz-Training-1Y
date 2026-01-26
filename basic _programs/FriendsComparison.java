iimport java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();

     
        System.out.print("Enter Amar's height (in cm): ");
        double heightAmar = sc.nextDouble();
        System.out.print("Enter Akbar's height (in cm): ");
        double heightAkbar = sc.nextDouble();
        System.out.print("Enter Anthony's height (in cm): ");
        double heightAnthony = sc.nextDouble();

      
        int youngestAge = ageAmar;
        String youngestFriend = "Amar";

        if (ageAkbar < youngestAge) {
            youngestAge = ageAkbar;
            youngestFriend = "Akbar";
        }
        if (ageAnthony < youngestAge) {
            youngestAge = ageAnthony;
            youngestFriend = "Anthony";
        }

     
        double tallestHeight = heightAmar;
        String tallestFriend = "Amar";

        if (heightAkbar > tallestHeight) {
            tallestHeight = heightAkbar;
            tallestFriend = "Akbar";
        }
        if (heightAnthony > tallestHeight) {
            tallestHeight = heightAnthony;
            tallestFriend = "Anthony";
        }

    
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge + " years.");
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm.");

        sc.close();
    }
}
