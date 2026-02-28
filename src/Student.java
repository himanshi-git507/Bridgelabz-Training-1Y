public class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

package college.faculty;

public class Faculty {
    private String name;
    private String subject;

    public Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void displayFaculty() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Subject: " + subject);
    }
}

import college.student.Student;
import college.faculty.Faculty;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Himanshi", 101);
        Faculty f = new Faculty("Dr. Sharma", "Computer Science");

        s.displayStudent();
        f.displayFaculty();
    }
}
