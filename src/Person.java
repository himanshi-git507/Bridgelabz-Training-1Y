class Person {

    private String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

class Employee extends Person {

    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Salary: " + salary);
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Employee emp = new Employee("Himanshi", 22, 50000);
        emp.setName("Himanshi Soni");
        emp.setSalary(55000);
        emp.displayDetails();
    }
}
