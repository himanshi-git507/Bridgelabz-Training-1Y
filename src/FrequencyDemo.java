import java.util.*;

class FrequencyUtil {
    public static Map<String, Integer> findFrequency(List<String> list) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : list) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        return map;
    }
}

public class FrequencyDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");

        Map<String, Integer> result = FrequencyUtil.findFrequency(list);
        System.out.println(result);
    }
}
