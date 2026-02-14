import java.util.Scanner;

public class SumNaturalNumbers {

    public static int recursiveSum(int n) {
        if (n == 1)
            return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int sumRec = recursiveSum(n);
        int sumForm = formulaSum(n);

        System.out.println(sumRec);
        System.out.println(sumForm);

        if (sumRec == sumForm)
            System.out.println("Both results are correct");
        else
            System.out.println("Results are not equal");
    }
}
