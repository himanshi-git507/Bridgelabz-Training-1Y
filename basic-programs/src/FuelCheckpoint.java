 abstract class FuelCheckpoint extends Checkpoint  {

    public FuelCheckpoint(String id, String loc, double dist, int exp, int act) {
        super(id, loc, dist, exp, act);
    }

    boolean isCritical() {
        return true;
    }

    String getType() {
        return "FuelCheckpoint";
    }

    double calculatePenalty() {
        if (isDelayed()) {
            return 10;
        }
        return 0;
    }
}
