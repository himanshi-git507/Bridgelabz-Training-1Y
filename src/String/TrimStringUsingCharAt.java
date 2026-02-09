import java.util.Scanner;

public class TrimStringUsingCharAt {

    public static int[] findTrimIndexes(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result = result + str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        int[] indexes = findTrimIndexes(input);
        String trimmedUsingCharAt = "";

        if (indexes[0] <= indexes[1]) {
            trimmedUsingCharAt = createSubstring(input, indexes[0], indexes[1]);
        }

        String trimmedUsingBuiltIn = input.trim();
        boolean isSame = compareStrings(trimmedUsingCharAt, trimmedUsingBuiltIn);

        System.out.println("Trimmed String: " + trimmedUsingCharAt);
        System.out.println("Are both strings equal: " + isSame);
    }
}
