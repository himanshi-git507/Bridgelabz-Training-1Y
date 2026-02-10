import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    static int generateGuess(int low, int high) {
        Random r = new Random();
        return r.nextInt(high - low + 1) + low;
    }

    static String getFeedback(Scanner sc) {
        return sc.next();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback;

        do {
            int guess = generateGuess(low, high);
            System.out.println(guess);
            feedback = getFeedback(sc);

            if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            }
        } while (!feedback.equalsIgnoreCase("correct"));
    }
}
