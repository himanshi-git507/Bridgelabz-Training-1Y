
        public class Student2 {
        private String name;
        private int rollNumber;

        public Student2(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        }

        public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        }
        }

        public class MainApp {
            public static void main(String[] args) {
                Student s = new Student("Himanshi", 101);
                s.display();
            }
        }
