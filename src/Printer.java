class Printer {

    public void print() {
        System.out.println("Printing document...");
    }
}

class LaserPrinter extends Printer {

    @Override
    public void print() {
        System.out.println("Printing document...");
    }
}

public class UnnecessaryOverrideExample {
    public static void main(String[] args) {
        Printer printer = new LaserPrinter();
        printer.print();
    }
}
