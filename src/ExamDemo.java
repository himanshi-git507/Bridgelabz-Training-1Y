import java.util.*;

class Question {
    String text;

    public Question(String text) {
        this.text = text;
    }

    public String toString() {
        return text;
    }
}

class Student {
    String id;
    String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class ExamDemo {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Q1"));
        questions.add(new Question("Q2"));
        questions.add(new Question("Q3"));
        questions.add(new Question("Q4"));

        Collections.shuffle(questions);

        Set<String> studentIds = new HashSet<>();
        Queue<Student> queue = new LinkedList<>();

        enroll(studentIds, queue, new Student("S1", "Aman"));
        enroll(studentIds, queue, new Student("S2", "Riya"));
        enroll(studentIds, queue, new Student("S1", "Aman"));

        while (!queue.isEmpty()) {
            Student s = queue.poll();
            System.out.println("\nStarting exam for: " + s);

            Stack<Question> history = new Stack<>();

            for (Question q : questions) {
                System.out.println("Question: " + q);
                history.push(q);
            }

            System.out.println("Navigating back:");
            while (!history.isEmpty()) {
                System.out.println("Back to: " + history.pop());
            }
        }
    }

    public static void enroll(Set<String> ids, Queue<Student> queue, Student s) {
        if (ids.add(s.id)) {
            queue.add(s);
            System.out.println("Enrolled: " + s);
        } else {
            System.out.println("Duplicate ID: " + s.id);
        }
    }
}
