 public class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    public Employee() {
        employeeID = "";
        department = "";
        salary = 0.0;
    }

    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    public Manager(String employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
        System.out.println("Team Size: " + teamSize);
    }
}

public class Employee{
    public static void main(String[] args) {
        Employee emp1 = new Employee("E101", "IT", 50000.0);
        emp1.displayEmployeeDetails();
        System.out.println();

        Manager mgr1 = new Manager("M201", "HR", 80000.0, 5);
        mgr1.displayManagerDetails();
    }
}
