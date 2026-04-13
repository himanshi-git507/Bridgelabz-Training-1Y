import java.util.*;

public class EmployeeDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> empMap = new HashMap<>();

        empMap.put(1, "HR");
        empMap.put(2, "IT");
        empMap.put(3, "Finance");
        empMap.put(4, "IT");
        empMap.put(5, "HR");

        empMap.put(2, "Finance");

        String targetDept = "HR";
        System.out.println("Employees in " + targetDept + ":");
        for (Map.Entry<Integer, String> entry : empMap.entrySet()) {
            if (entry.getValue().equals(targetDept)) {
                System.out.println("Employee ID: " + entry.getKey());
            }
        }

        Map<String, Integer> deptCount = new HashMap<>();
        for (String dept : empMap.values()) {
            deptCount.put(dept, deptCount.getOrDefault(dept, 0) + 1);
        }

        System.out.println("\nTotal employees per department:");
        for (Map.Entry<String, Integer> entry : deptCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
