/**
 * Abstract base class representing a generic Employee.
 *
 * Purpose:
 * Provides common structure and shared behavior for all employee types.
 *
 * Subclass Contract:
 * - Subclasses must implement calculateSalary().
 * - Subclasses may override getRoleDescription() if specialized behavior is needed.
 * - Subclasses should not modify the core workflow defined in generatePaySlip().
 */
abstract class Employee {

    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public abstract double calculateSalary();

    public String getRoleDescription() {
        return "General Employee";
    }

    public final void generatePaySlip() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Role: " + getRoleDescription());
        System.out.println("Salary: " + calculateSalary());
    }
}

/**
 * Represents a full-time employee.
 *
 * Expected Behavior:
 * - Must implement calculateSalary().
 * - May override getRoleDescription().
 */
class FullTimeEmployee extends Employee {

    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public String getRoleDescription() {
        return "Full-Time Employee";
    }
}

/**
 * Represents a part-time employee.
 *
 * Expected Behavior:
 * - Must implement calculateSalary().
 * - May override getRoleDescription().
 */
class PartTimeEmployee extends Employee {

    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String getRoleDescription() {
        return "Part-Time Employee";
    }
}

public class DocumentationExample {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Himanshi", 101, 50000);
        Employee emp2 = new PartTimeEmployee("Riya", 102, 500, 80);

        emp1.generatePaySlip();
        System.out.println();
        emp2.generatePaySlip();
    }
}
