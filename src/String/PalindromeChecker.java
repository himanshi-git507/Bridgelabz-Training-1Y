import java.util.Scanner;

public class PalindromeChecker {
    static String takeInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    static void displayResult(boolean result) {
        System.out.println(result);
    }

    public static void main(String[] args) {
        String text = takeInput();
        displayResult(isPalindrome(text));
    }
}
