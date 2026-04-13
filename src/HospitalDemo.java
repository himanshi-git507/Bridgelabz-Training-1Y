import java.util.*;

class Patient {
    String id;
    String name;

    public Patient(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient p = (Patient) o;
        return id.equals(p.id);
    }

    public int hashCode() {
        return id.hashCode();
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        Set<Patient> admitted = new HashSet<>();
        Queue<Patient> treatmentQueue = new LinkedList<>();
        Stack<Patient> dischargedStack = new Stack<>();
        List<Patient> history = new ArrayList<>();

        admit(admitted, treatmentQueue, history, new Patient("P1", "Aman"));
        admit(admitted, treatmentQueue, history, new Patient("P2", "Riya"));
        admit(admitted, treatmentQueue, history, new Patient("P1", "Aman"));

        while (!treatmentQueue.isEmpty()) {
            Patient p = treatmentQueue.poll();
            System.out.println("Treating: " + p);
            discharge(admitted, dischargedStack, p);
        }

        System.out.println("\nRe-admitting recently discharged patient:");
        if (!dischargedStack.isEmpty()) {
            Patient p = dischargedStack.pop();
            admit(admitted, treatmentQueue, history, p);
            System.out.println("Re-admitted: " + p);
        }
    }

    public static void admit(Set<Patient> admitted, Queue<Patient> queue, List<Patient> history, Patient p) {
        if (admitted.add(p)) {
            queue.add(p);
            history.add(p);
            System.out.println("Admitted: " + p);
        } else {
            System.out.println("Duplicate patient not admitted: " + p);
        }
    }

    public static void discharge(Set<Patient> admitted, Stack<Patient> stack, Patient p) {
        admitted.remove(p);
        stack.push(p);
        System.out.println("Discharged: " + p);
    }
}
