import java.util.Scanner;

public class StudentMarks {

    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            scores[i][0] = (int)(Math.random() * 90) + 10;
            scores[i][1] = (int)(Math.random() * 90) + 10;
            scores[i][2] = (int)(Math.random() * 90) + 10;
        }
        return scores;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();

        int[][] scores = generateScores(students);

        System.out.printf("%10s %10s %10s %10s %10s %12s\n",
                "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage");

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            System.out.printf("%10d %10d %10d %10d %10.2f %11.2f%%\n",
                    scores[i][0], scores[i][1], scores[i][2],
                    total, average, percentage);
        }
    }
}