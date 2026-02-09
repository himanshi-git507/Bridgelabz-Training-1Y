import java.util.Random;
import java.util.Scanner;

public class StudentScoreCard {

    public static int[][] generateScores(int students) {
        Random r = new Random();
        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = r.nextInt(90) + 10;
            scores[i][1] = r.nextInt(90) + 10;
            scores[i][2] = r.nextInt(90) + 10;
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] result = new double[students][4];

        for (int i = 0; i < students; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3;
            double percentage = (total / 300) * 100;

            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
            result[i][3] = i;
        }
        return result;
    }

    public static String[] calculateGrades(double[][] result) {
        String[] grades = new String[result.length];

        for (int i = 0; i < result.length; i++) {
            double p = result[i][2];

            if (p >= 90)
                grades[i] = "A+";
            else if (p >= 80)
                grades[i] = "A";
            else if (p >= 70)
                grades[i] = "B";
            else if (p >= 60)
                grades[i] = "C";
            else if (p >= 50)
                grades[i] = "D";
            else
                grades[i] = "F";
        }
        return grades;
    }

    public static void displayScoreCard(int[][] scores, double[][] result, String[] grades) {
        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                            scores[i][0] + "\t" +
                            scores[i][1] + "\t" +
                            scores[i][2] + "\t" +
                            result[i][0] + "\t" +
                            result[i][1] + "\t" +
                            result[i][2] + "\t" +
                            grades[i]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();

        int[][] scores = generateScores(students);
        double[][] result = calculateResults(scores);
        String[] grades = calculateGrades(result);

        displayScoreCard(scores, result, grades);
    }
}
