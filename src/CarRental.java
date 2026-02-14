public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;
    double totalCost;

    public CarRental() {
        customerName = "";
        carModel = "";
        rentalDays = 0;
        dailyRate = 0.0;
        totalCost = 0.0;
    }

    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
        calculateTotal();
    }

    public CarRental(CarRental cr) {
        this.customerName = cr.customerName;
        this.carModel = cr.carModel;
        this.rentalDays = cr.rentalDays;
        this.dailyRate = cr.dailyRate;
        this.totalCost = cr.totalCost;
    }

    public void calculateTotal() {
        totalCost = rentalDays * dailyRate;
    }

    public void displayRental() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: " + dailyRate);
        System.out.println("Total Cost: " + totalCost);
    }

    public static void main(String[] args) {
        CarRental defaultRental = new CarRental();
        CarRental paramRental = new CarRental("Himanshi", "Toyota Corolla", 5, 2000.0);
        CarRental copyRental = new CarRental(paramRental);

        defaultRental.displayRental();
        System.out.println();
        paramRental.displayRental();
        System.out.println();
        copyRental.displayRental();
    }
}