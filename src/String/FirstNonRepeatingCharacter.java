import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    static char findFirstNonRepeating(String text) {
        int[] freq = new int[256];
        int i = 0;

        try {
            while (true) {
                char ch = text.charAt(i);
                freq[ch]++;
                i++;
            }
        } catch (Exception e) {
        }

        i = 0;
        try {
            while (true) {
                char ch = text.charAt(i);
                if (freq[ch] == 1) {
                    return ch;
                }
                i++;
            }
        } catch (Exception e) {
        }

        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        char result = findFirstNonRepeating(text);

        if (result != '\0') {
            System.out.println(result);
        } else {
            System.out.println("No non-repeating character found");
        }
    }
}
