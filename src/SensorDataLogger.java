import java.util.ArrayList;

public class SensorDataLogger {

    static ArrayList<Double> dataList = new ArrayList<>();

    public static void logTemperature(double temp) {
        dataList.add(temp);
    }

    public static void logTemperature(Double temp) {
        dataList.add(temp);
    }

    public static void displayData() {
        for (Double value : dataList) {
            double temp = value;
            System.out.println("Temperature: " + temp);
        }
    }

    public static void main(String[] args) {
        double primitiveTemp = 36.5;
        Double wrapperTemp = 37.2;

        logTemperature(primitiveTemp);
        logTemperature(wrapperTemp);

        displayData();
    }
}
