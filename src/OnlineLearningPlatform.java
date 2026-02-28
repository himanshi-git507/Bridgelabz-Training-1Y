class Course {
    int courseId;
    String courseName;
    double price;
    static String platformName = "LearnHub";

    Course(int courseId, String courseName, double price) {
        this.courseId = courseId;
        this.courseName = toTitleCase(courseName);
        this.price = price;
    }

    double getFinalPrice() {
        return price;
    }

    String toTitleCase(String input) {
        String[] words = input.toLowerCase().split(" ");
        String result = "";
        for (String word : words) {
            result += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
        }
        return result.trim();
    }

    void display() {
        System.out.println("Platform: " + platformName);
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Final Price: ₹" + getFinalPrice());
        System.out.println();
    }
}

class RecordedCourse extends Course {
    RecordedCourse(int courseId, String courseName, double price) {
        super(courseId, courseName, price);
    }

    double getFinalPrice() {
        return price - (price * 0.10);
    }
}

class LiveCourse extends Course {
    LiveCourse(int courseId, String courseName, double price) {
        super(courseId, courseName, price);
    }

    double getFinalPrice() {
        return price - (price * 0.05);
    }
}

public class OnlineLearningPlatform {
    public static void main(String[] args) {
        Course c1 = new RecordedCourse(101, "java programming", 5000);
        Course c2 = new LiveCourse(102, "data structures", 6000);

        c1.display();
        c2.display();
    }
}
