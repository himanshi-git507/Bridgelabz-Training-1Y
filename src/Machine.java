class Machine {
    public void start() {
        System.out.println("Machine started");
    }
}

class Vehicle extends Machine {
    public void move() {
        System.out.println("Vehicle moving");
    }
}

class Car extends Vehicle {
    public void openDoors() {
        System.out.println("Car doors opened");
    }
}

class ElectricCar extends Car {
    public void charge() {
        System.out.println("Electric car charging");
    }
}

class TeslaModelS extends ElectricCar {
    public void autopilot() {
        System.out.println("Autopilot enabled");
    }
}

public class DeepInheritanceExample {
    public static void main(String[] args) {
        TeslaModelS car = new TeslaModelS();
        car.start();
        car.move();
        car.openDoors();
        car.charge();
        car.autopilot();
    }
}
