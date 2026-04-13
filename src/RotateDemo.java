import java.util.*;

class RotateUtil {
    public static <T> void rotate(List<T> list, int k) {
        int n = list.size();
        k = k % n;

        reverse(list, 0, n - 1);
        reverse(list, 0, n - k - 1);
        reverse(list, n - k, n - 1);
    }

    private static <T> void reverse(List<T> list, int start, int end) {
        while (start < end) {
            T temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
}

public class RotateDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        RotateUtil.rotate(list, 2);
        System.out.println(list);
    }
}
