import java.util.Scanner;

public class VowelConsonantCount {

    public static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static int[] findVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            String result = checkChar(str.charAt(i));
            if (result.equals("Vowel")) {
                vowels++;
            } else if (result.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int[] count = findVowelsAndConsonants(input);

        System.out.println("Vowels: " + count[0]);
        System.out.println("Consonants: " + count[1]);
    }
}
import java.util.Scanner;

public class CharacterType {

    public static String checkCharacter(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static String[][] findCharacterTypes(String str) {
        String[][] result = new String[str.length()][2];

        for (int i = 0; i < str.length(); i++) {
            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = checkCharacter(str.charAt(i));
        }

        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.println("Character\tType");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[][] output = findCharacterTypes(input);
        displayTable(output);
    }
}
