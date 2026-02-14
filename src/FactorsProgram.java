import java.util.Scanner;

public class FactorsProgram {

    public static int[] findFactors(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static long findProduct(int[] arr) {
        long product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }

    public static double findSumOfSquares(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(arr[i], 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int[] factors = findFactors(number);

        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        System.out.println();
        System.out.println(findSum(factors));
        System.out.println(findProduct(factors));
        System.out.println(findSumOfSquares(factors));
    }
}
