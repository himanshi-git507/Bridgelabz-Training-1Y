import java.util.Scanner;

public class NumberChecker {

    public static int countDigits(int number) {
        number = Math.abs(number);
        if (number == 0) return 1;
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        number = Math.abs(number);
        int size = countDigits(number);
        int[] digits = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        boolean hasZero = false;
        boolean hasNonZero = false;
        for (int d : digits) {
            if (d == 0) hasZero = true;
            if (d != 0) hasNonZero = true;
        }
        return hasZero && hasNonZero;
    }

    public static boolean isArmstrongNumber(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == Math.abs(number);
    }

    public static int[] findLargestSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int digitCount = countDigits(number);
        int[] digits = storeDigits(number);

        System.out.println("Digit Count: " + digitCount);
        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrongNumber(number, digits));

        int[] large = findLargestSecondLargest(digits);
        System.out.println("Largest: " + large[0]);
        System.out.println("Second Largest: " + large[1]);

        int[] small = findSmallestSecondSmallest(digits);
        System.out.println("Smallest: " + small[0]);
        System.out.println("Second Smallest: " + small[1]);
    }
}
