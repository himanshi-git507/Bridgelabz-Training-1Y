import java.util.*;
import java.util.stream.*;

class Doctor {
    String name;
    String specialty;
    boolean weekendAvailable;

    Doctor(String name, String specialty, boolean weekendAvailable) {
        this.name = name;
        this.specialty = specialty;
        this.weekendAvailable = weekendAvailable;
    }

    public String toString() {
        return name + " | " + specialty + " | Weekend Available: " + weekendAvailable;
    }
}

public class HospitalApp2 {
    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. Sharma", "Cardiology", true),
                new Doctor("Dr. Mehta", "Neurology", false),
                new Doctor("Dr. Singh", "Orthopedics", true),
                new Doctor("Dr. Gupta", "Dermatology", true),
                new Doctor("Dr. Verma", "Pediatrics", false)
        );

        List<Doctor> availableDoctors = doctors.stream()
                .filter(d -> d.weekendAvailable)
                .sorted((d1, d2) -> d1.specialty.compareTo(d2.specialty))
                .collect(Collectors.toList());

        availableDoctors.forEach(System.out::println);
    }
}
