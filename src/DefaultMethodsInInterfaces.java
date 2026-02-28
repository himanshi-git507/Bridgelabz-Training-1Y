interface PaymentProcessor {
    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed successfully");
    }
}

class UPIProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Payment of ₹" + amount + " processed via UPI");
    }
}

class CreditCardProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Payment of ₹" + amount + " processed via Credit Card");
    }
}

interface DataExporter {
    void export(String data);

    default void exportToJSON(String data) {
        System.out.println("Exporting data in JSON format: { \"data\": \"" + data + "\" }");
    }
}

class CSVExporter implements DataExporter {
    public void export(String data) {
        System.out.println("Exporting data in CSV format: " + data);
    }
}

class PDFExporter implements DataExporter {
    public void export(String data) {
        System.out.println("Exporting data in PDF format: " + data);
    }
}

interface VehicleDashboard {
    void displaySpeed(int speed);

    default void displayBattery(int percentage) {
        System.out.println("Battery: " + percentage + "%");
    }
}

class Car implements VehicleDashboard {
    public void displaySpeed(int speed) {
        System.out.println("Car Speed: " + speed + " km/h");
    }
}

class ElectricCar implements VehicleDashboard {
    public void displaySpeed(int speed) {
        System.out.println("Electric Car Speed: " + speed + " km/h");
    }

    public void displayBattery(int percentage) {
        System.out.println("Electric Car Battery: " + percentage + "%");
    }
}

public class DefaultMethodsInInterfaces {
    public static void main(String[] args) {

        PaymentProcessor upi = new UPIProcessor();
        PaymentProcessor card = new CreditCardProcessor();

        upi.processPayment(1000);
        upi.refund(200);
        card.processPayment(500);

        DataExporter csv = new CSVExporter();
        DataExporter pdf = new PDFExporter();

        csv.export("Report Data");
        csv.exportToJSON("Report Data");
        pdf.export("Invoice Data");

        VehicleDashboard car = new Car();
        VehicleDashboard ev = new ElectricCar();

        car.displaySpeed(80);
        ev.displaySpeed(100);
        ev.displayBattery(75);
    }
}
