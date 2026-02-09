import java.util.Scanner;

public class ShortestLongestWord {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            return count;
        }
    }

    public static String[] customSplit(String text) {
        int length = findLength(text);
        int wordCount = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++;

        int[] indexes = new int[wordCount + 1];
        indexes[0] = -1;
        int idx = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                indexes[idx++] = i;
            }
        }
        indexes[idx] = length;

        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            words[i] = text.substring(indexes[i] + 1, indexes[i + 1]);
        }

        return words;
    }

    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static int[] findShortestLongest(String[][] data) {
        int min = Integer.parseInt(data[0][1]);
        int max = Integer.parseInt(data[0][1]);
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            if (len < min) {
                min = len;
                minIndex = i;
            }
            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[][] table = wordsWithLength(words);
        int[] result = findShortestLongest(table);

        System.out.println("Shortest word: " + table[result[0]][0]);
        System.out.println("Longest word: " + table[result[1]][0]);

        sc.close();
    }
}
