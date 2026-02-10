import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        char ch = sc.next().charAt(0);

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ch) {
                result += text.charAt(i);
            }
        }

        System.out.println(result);
    }
}
