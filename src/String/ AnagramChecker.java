import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    static boolean isAnagram(String s1, String s2) {
        char[] a = s1.replaceAll("\\s+", "").toLowerCase().toCharArray();
        char[] b = s2.replaceAll("\\s+", "").toLowerCase().toCharArray();

        if (a.length != b.length) return false;

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(isAnagram(s1, s2));
    }
}
