public class Course {
    private String courseName;
    private int courseCode;

    public Course(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }
}

import com.university.department.cse.Course;

public class MainApp {
    public static void main(String[] args) {
        Course c = new Course("Data Structures", 101);
        c.displayCourse();
    }
}
