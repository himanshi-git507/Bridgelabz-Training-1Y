public class Student3 {
    private String name;
    private int rollNo;
    private String course;

    public Student3(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    public void display() {
        System.out.println("Student: " + name + ", Roll No: " + rollNo + ", Course: " + course);
    }
}

package college.faculty;

public class Faculty {
    private String name;
    private String subject;
    private int experience;

    public Faculty(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }

    public void display() {
        System.out.println("Faculty: " + name + ", Subject: " + subject + ", Experience: " + experience + " years");
    }
}

package college.department;

public class Department {
    private String deptName;
    private String hod;
    public static String collegeName = "ABC Engineering College";

    public Department(String deptName, String hod) {
        this.deptName = deptName;
        this.hod = hod;
    }

    public void display() {
        System.out.println("Department: " + deptName + ", HOD: " + hod);
    }
}

package college.main;

import college.student.Student;
import college.faculty.Faculty;
import college.department.Department;
import static college.department.Department.collegeName;

public class MainApp {
    public static void main(String[] args) {

        Student s = new Student("Amit", 101, "Computer Science");
        Faculty f = new Faculty("Dr. Sharma", "Data Structures", 10);
        Department d = new Department("Computer Science", "Dr. Mehta");

        System.out.println("===== " + collegeName + " =====");
        d.display();
        s.display();
        f.display();
    }
}