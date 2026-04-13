import java.util.*;

class DuplicateUtil {
    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }
}

public class DuplicateDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> result = DuplicateUtil.removeDuplicates(list);
        System.out.println(result);
    }
}
