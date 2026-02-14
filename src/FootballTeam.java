public class FootballTeam {

    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }
        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            min = (int)Math.min(min, h);
        }
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            max = (int)Math.max(max, h);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);

        for (int h : heights) {
            System.out.println(h);
        }

        System.out.println("Mean Height: " + findMean(heights));
        System.out.println("Shortest Height: " + findShortest(heights));
        System.out.println("Tallest Height: " + findTallest(heights));
    }
}