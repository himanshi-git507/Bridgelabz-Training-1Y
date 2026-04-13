import java.util.*;

public class SchoolReportDemo {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> data = new HashMap<>();

        addMarks(data, "Math", "Aman", 85);
        addMarks(data, "Math", "Riya", 95);
        addMarks(data, "Math", "Sohan", 78);

        addMarks(data, "Science", "Aman", 88);
        addMarks(data, "Science", "Riya", 92);
        addMarks(data, "Science", "Sohan", 81);

        addMarks(data, "English", "Aman", 75);
        addMarks(data, "English", "Riya", 89);
        addMarks(data, "English", "Sohan", 91);

        System.out.println("Top Scorer per Subject:");
        for (String subject : data.keySet()) {
            String topStudent = "";
            int max = Integer.MIN_VALUE;

            for (Map.Entry<String, Integer> entry : data.get(subject).entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    topStudent = entry.getKey();
                }
            }

            System.out.println(subject + " -> " + topStudent + " (" + max + ")");
        }

        System.out.println("\nAverage Score per Subject:");
        for (String subject : data.keySet()) {
            int sum = 0;
            int count = 0;

            for (int marks : data.get(subject).values()) {
                sum += marks;
                count++;
            }

            double avg = (double) sum / count;
            System.out.println(subject + " -> " + avg);
        }

        System.out.println("\nSubjects with score above 90:");
        for (String subject : data.keySet()) {
            for (int marks : data.get(subject).values()) {
                if (marks > 90) {
                    System.out.println(subject);
                    break;
                }
            }
        }
    }

    public static void addMarks(Map<String, Map<String, Integer>> data, String subject, String student, int marks) {
        data.putIfAbsent(subject, new HashMap<>());
        data.get(subject).put(student, marks);
    }
}
