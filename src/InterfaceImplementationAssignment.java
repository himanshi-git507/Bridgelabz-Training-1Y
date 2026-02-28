interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() {
        System.out.println("Light turned ON");
    }
    public void turnOff() {
        System.out.println("Light turned OFF");
    }
}

class AC implements SmartDevice {
    public void turnOn() {
        System.out.println("AC turned ON");
    }
    public void turnOff() {
        System.out.println("AC turned OFF");
    }
}

class TV implements SmartDevice {
    public void turnOn() {
        System.out.println("TV turned ON");
    }
    public void turnOff() {
        System.out.println("TV turned OFF");
    }
}

interface VehicleRental {
    void rent();
    void returnVehicle();
}

class Car implements VehicleRental {
    public void rent() {
        System.out.println("Car rented");
    }
    public void returnVehicle() {
        System.out.println("Car returned");
    }
}

class Bike implements VehicleRental {
    public void rent() {
        System.out.println("Bike rented");
    }
    public void returnVehicle() {
        System.out.println("Bike returned");
    }
}

class Bus implements VehicleRental {
    public void rent() {
        System.out.println("Bus rented");
    }
    public void returnVehicle() {
        System.out.println("Bus returned");
    }
}

interface DigitalPayment {
    void pay(double amount);
}

class UPI implements DigitalPayment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class CreditCard implements DigitalPayment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

class Wallet implements DigitalPayment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Wallet");
    }
}

public class MainApp {
    public static void main(String[] args) {

        SmartDevice light = new Light();
        SmartDevice ac = new AC();
        SmartDevice tv = new TV();

        light.turnOn();
        ac.turnOn();
        tv.turnOn();
        light.turnOff();

        VehicleRental car = new Car();
        VehicleRental bike = new Bike();
        VehicleRental bus = new Bus();

        car.rent();
        bike.rent();
        bus.returnVehicle();

        DigitalPayment upi = new UPI();
        DigitalPayment card = new CreditCard();
        DigitalPayment wallet = new Wallet();

        upi.pay(500);
        card.pay(1200);
        wallet.pay(300);
    }
}
