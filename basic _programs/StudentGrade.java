import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter marks for Physics: ");
        double physics = sc.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double maths = sc.nextDouble();

       
        if (physics < 0 || physics > 100 || chemistry < 0 || chemistry > 100 || maths < 0 || maths > 100) {
            System.out.println("Error: Marks should be between 0 and 100.");
        } else {
           
            double total = physics + chemistry + maths;
            double percentage = (total / 300) * 100;

         
            String grade, remarks;
            if (percentage >= 90) {
                grade = "A+";
                remarks = "Excellent";
            } else if (percentage >= 80) {
                grade = "A";
                remarks = "Very Good";
            } else if (percentage >= 70) {
                grade = "B";
                remarks = "Good";
            } else if (percentage >= 60) {
                grade = "C";
                remarks = "Average";
            } else if (percentage >= 50) {
                grade = "D";
                remarks = "Pass";
            } else {
                grade = "F";
                remarks = "Fail";
            }

       
            System.out.println("\n--- Student Report ---");
            System.out.println("Physics: " + physics);
            System.out.println("Chemistry: " + chemistry);
            System.out.println("Maths: " + maths);
            System.out.println("Total Marks: " + total + "/300");
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Grade: " + grade);
            System.out.println("Remarks: " + remarks);
        }

        sc.close();
    }
}
