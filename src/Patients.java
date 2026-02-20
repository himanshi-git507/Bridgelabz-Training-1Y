import java.util.*;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;
    private List<String> medicalHistory;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = new ArrayList<>();
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    protected List<String> getMedicalHistory() {
        return medicalHistory;
    }

    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    public double calculateBill() {
        return daysAdmitted * dailyCharge + 2000;
    }

    public void addRecord(String record) {
        getMedicalHistory().add(record);
        setDiagnosis(record);
    }

    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ":");
        for (String record : getMedicalHistory()) {
            System.out.println(record);
        }
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee + 500;
    }

    public void addRecord(String record) {
        getMedicalHistory().add(record);
        setDiagnosis(record);
    }

    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ":");
        for (String record : getMedicalHistory()) {
            System.out.println(record);
        }
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient inPatient = new InPatient("P001", "Rahul", 35, 5, 3000);
        OutPatient outPatient = new OutPatient("P002", "Anita", 28, 1000);

        patients.add(inPatient);
        patients.add(outPatient);

        inPatient.addRecord("Fever and Infection");
        outPatient.addRecord("Regular Checkup");

        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Total Bill: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                record.viewRecords();
            }

            System.out.println("----------------------------");
        }
    }
}
