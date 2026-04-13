class CompareUtil {
    public static <T> boolean isEqual(T a, T b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return a.equals(b);
    }
}

public class CompareDemo {
    public static void main(String[] args) {
        System.out.println(CompareUtil.isEqual(10, 10));
        System.out.println(CompareUtil.isEqual("Hello", "Hello"));
        System.out.println(CompareUtil.isEqual(5.5, 6.5));
    }
}
