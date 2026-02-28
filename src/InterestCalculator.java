mport static java.lang.Math.*;

public class InterestCalculator {

    public static double calculateSimpleInterest(double P, double R, double T) {
        return (P * R * T) / 100;
    }

    public static double calculateCompoundInterest(double P, double R, double T) {
        return P * (pow((1 + R / 100), T)) - P;
    }
}

Main.java
import com.bank.util.InterestCalculator;

public class Main {
    public static void main(String[] args) {
        double principal = 10000;
        double rate = 5;
        double time = 2;

        double si = InterestCalculator.calculateSimpleInterest(principal, rate, time);
        double ci = InterestCalculator.calculateCompoundInterest(principal, rate, time);

        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
    }
}
