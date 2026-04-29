public abstract class Checkpoint {
    String checkpointId, locationName;
    double distanceFromLast;
    int expectedDuration, actualDuration;

    public Checkpoint(String id, String loc, double dist, int exp, int act) {
        checkpointId = id;
        locationName = loc;
        distanceFromLast = dist;
        expectedDuration = exp;
        actualDuration = act;
    }

    public boolean isDelayed() {
        return actualDuration > expectedDuration;
    }

    public abstract boolean isCritical();
    public abstract String getType();
    public abstract double calculatePenalty();
}