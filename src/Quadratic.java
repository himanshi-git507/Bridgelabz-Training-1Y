import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println(root1);
            System.out.println(root2);
        }
        else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println(root);
        }
        else {
            return;
        }
    }
}