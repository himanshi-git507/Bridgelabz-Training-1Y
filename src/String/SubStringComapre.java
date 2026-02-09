import java.util.Scanner;

public class SubstringComparison {

    public static String createSubstringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }

    public static boolean compareStringsUsingCharAt(String s1, String s2) {
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

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String substringCharAt = createSubstringUsingCharAt(text, start, end);
        String substringBuiltIn = text.substring(start, end);

        boolean result = compareStringsUsingCharAt(substringCharAt, substringBuiltIn);

        System.out.println(substringCharAt);
        System.out.println(substringBuiltIn);

        if (result) {
            System.out.println("Both substrings are SAME");
        } else {
            System.out.println("Both substrings are DIFFERENT");
        }

        sc.close();
    }
}
