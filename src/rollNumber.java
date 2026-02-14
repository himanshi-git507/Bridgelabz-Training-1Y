class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student() {
        rollNumber = 0;
        name = "";
        CGPA = 0.0;
    }

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPostgraduateDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
        System.out.println("Specialization: " + specialization);
    }
}

  public class rollNumber {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Himanshi", 9.2);
        s1.displayStudentDetails();
        System.out.println();

        PostgraduateStudent pg = new PostgraduateStudent(201, "Rohit", 8.8, "Computer Science");
        pg.displayPostgraduateDetails();
    }
}
