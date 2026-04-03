import java.util.ArrayList;
import java.util.Objects;

public class ProductRatingsAnalyzer {
    public static void main(String[] args) {
        int[] primitiveRatings = {4, 5, 3, 4};
        ArrayList<Integer> wrapperRatings = new ArrayList<>();

        wrapperRatings.add(5);
        wrapperRatings.add(null);
        wrapperRatings.add(3);
        wrapperRatings.add(4);

        ArrayList<Integer> combinedList = new ArrayList<>();

        for (int rating : primitiveRatings) {
            combinedList.add(rating);
        }

        combinedList.addAll(wrapperRatings);

        int sum = 0;
        int count = 0;

        for (Integer rating : combinedList) {
            if (Objects.nonNull(rating)) {
                sum += rating;
                count++;
            }
        }

        double average = (count == 0) ? 0 : (double) sum / count;

        System.out.println("Average rating = " + average);
    }
}
