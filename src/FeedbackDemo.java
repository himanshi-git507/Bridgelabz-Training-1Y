import java.util.*;

public class FeedbackDemo {
    public static void main(String[] args) {
        List<String> feedbackList = new ArrayList<>();
        feedbackList.add("Good service");
        feedbackList.add("Improve UI");
        feedbackList.add("Good service");
        feedbackList.add("Fast delivery");
        feedbackList.add("Improve UI");

        Set<String> uniqueFeedback = new LinkedHashSet<>(feedbackList);

        Queue<String> queue = new LinkedList<>(uniqueFeedback);

        Stack<String> stack = new Stack<>();

        while (!queue.isEmpty()) {
            String feedback = queue.poll();
            System.out.println("Processing: " + feedback);
            stack.push(feedback);
        }

        System.out.println("\nRecent Feedbacks:");
        int count = 0;
        while (!stack.isEmpty() && count < 3) {
            System.out.println(stack.pop());
            count++;
        }
    }
}
