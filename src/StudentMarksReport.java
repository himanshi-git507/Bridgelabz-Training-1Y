import java.util.ArrayList;

public class StudentMarksReport {
    public static void main(String[] args) {
        Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "abc"};

        ArrayList<Integer> validMarks = new ArrayList<>();

        for (Object input : inputs) {
            try {
                if (input instanceof Integer) {
                    validMarks.add((Integer) input);
                } else if (input instanceof String) {
                    String str = (String) input;
                    if (!str.equalsIgnoreCase("null")) {
                        validMarks.add(Integer.parseInt(str));
                    }
                }
            } catch (NumberFormatException e) {
            }
        }

        int sum = 0;

        for (int mark : validMarks) {
            sum += mark;
        }

        double average = validMarks.size() == 0 ? 0 : (double) sum / validMarks.size();

        System.out.println("Average marks = " + average);
    }
}
