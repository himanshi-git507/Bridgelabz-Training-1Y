public class RandomStats {

    public int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }
        return arr;
    }

    public double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            min = (int)Math.min(min, numbers[i]);
            max = (int)Math.max(max, numbers[i]);
        }

        double avg = sum / numbers.length;

        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        RandomStats obj = new RandomStats();

        int[] numbers = obj.generate4DigitRandomArray(5);

        for (int num : numbers) {
            System.out.println(num);
        }

        double[] result = obj.findAverageMinMax(numbers);

        System.out.println("Average: " + result[0]);
        System.out.println("Min: " + (int)result[1]);
        System.out.println("Max: " + (int)result[2]);
    }
}