class Engine {
    private String type;
    private int horsepower;

    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public void start() {
        System.out.println("Engine started: " + type + " with " + horsepower + " HP");
    }

    public void stop() {
        System.out.println("Engine stopped");
    }
}

class Car {
    private String model;
    private Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void startCar() {
        System.out.println("Starting car: " + model);
        engine.start();
    }

    public void stopCar() {
        System.out.println("Stopping car: " + model);
        engine.stop();
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Engine petrolEngine = new Engine("Petrol", 150);
        Car car = new Car("Honda City", petrolEngine);

        car.startCar();
        car.stopCar();
    }
}
