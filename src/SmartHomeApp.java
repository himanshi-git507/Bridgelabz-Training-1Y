@FunctionalInterface
interface LightBehavior {
    void activate();
}

class SmartLightController {
    public void runLight(LightBehavior behavior) {
        behavior.activate();
    }
}

public class SmartHomeApp {
    public static void main(String[] args) {
        SmartLightController controller = new SmartLightController();

        controller.runLight(() -> System.out.println("Motion detected → Lights ON (100% brightness)"));
        controller.runLight(() -> System.out.println("Time is night → Lights DIM (30%)"));
        controller.runLight(() -> System.out.println("Voice command → Lights changed to BLUE"));
        controller.runLight(() -> System.out.println("Party Mode → Lights flashing in multiple colors"));
    }
}
