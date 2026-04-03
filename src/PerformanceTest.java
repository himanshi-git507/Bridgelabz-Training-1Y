import java.util.ArrayList;

public class PerformanceTest {
    public static void main(String[] args) {

        int size = 1_000_000;

        long startArray = System.currentTimeMillis();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }

        long sumArray = 0;
        for (int i = 0; i < size; i++) {
            sumArray += arr[i];
        }

        long endArray = System.currentTimeMillis();

        long startList = System.currentTimeMillis();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        long sumList = 0;
        for (int i = 0; i < size; i++) {
            sumList += list.get(i);
        }

        long endList = System.currentTimeMillis();

        System.out.println("Array sum = " + sumArray);
        System.out.println("Array time = " + (endArray - startArray) + " ms");

        System.out.println("ArrayList sum = " + sumList);
        System.out.println("ArrayList time = " + (endList - startList) + " ms");
    }
}
