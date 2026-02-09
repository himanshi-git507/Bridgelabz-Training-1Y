import java.util.Scanner;
import java.util.StringTokenizer;

public class ContactManager {

    static void processContacts(String input) {
        String[] contacts = input.split("\n");
        int count = 0;

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].trim().isEmpty()) {
                continue;
            }

            StringTokenizer st = new StringTokenizer(contacts[i], ";");

            String name = st.hasMoreTokens() ? st.nextToken() : "N/A";
            String phone = st.hasMoreTokens() ? st.nextToken() : "N/A";
            String email = st.hasMoreTokens() ? st.nextToken() : "N/A";
            String address = st.hasMoreTokens() ? st.nextToken() : "N/A";

            System.out.println("---------------");
            System.out.println("Name    : " + name);
            System.out.println("Phone   : " + phone);
            System.out.println("Email   : " + email);
            System.out.println("Address : " + address);
            System.out.println("---------------");

            count++;
        }

        System.out.println("Total Contacts Processed: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            input.append(sc.nextLine()).append("\n");
        }

        processContacts(input.toString());
    }
}
