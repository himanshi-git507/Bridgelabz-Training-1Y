public class UserValidation {

    public static boolean isValidAge(String input) {
        try {
            int age = Integer.parseInt(input);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] inputs = {"20", "17", "abc", "18"};

        for (String input : inputs) {
            System.out.println("Input: " + input + " -> " + isValidAge(input));
        }
    }
}
