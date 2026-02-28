class Student {
    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 40) return "D";
        else return "F";
    }
}

class EngineeringStudent extends Student {
    String branch;

    EngineeringStudent(int rollNo, String name, double marks, String branch) {
        super(rollNo, name, marks);
        this.branch = branch;
    }

    String getFullName() {
        return name + " - " + branch;
    }
}

public class StudentResultSystem {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Himanshi", 85);
        EngineeringStudent s2 = new EngineeringStudent(102, "Rahul", 92, "CSE");

        System.out.println("Student: " + s1.name + ", Grade: " + s1.calculateGrade());
        System.out.println("Student: " + s2.getFullName() + ", Grade: " + s2.calculateGrade());
    }
}
