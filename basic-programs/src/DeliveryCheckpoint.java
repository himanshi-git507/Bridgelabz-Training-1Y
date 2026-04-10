     public class DeliveryCheckpoint extends Checkpoint {

        public DeliveryCheckpoint(String id, String loc, double dist, int exp, int act) {
            super(id, loc, dist, exp, act);
        }

        boolean isCritical() {
            return true;
        }

        String getType() {
            return "DeliveryCheckpoint";
        }

        @Override
        double CalculatePenalty() {
            return 0;
        }

        double calculatePenalty() {
            if (isDelayed()) {
                return (actualDuration - expectedDuration) * 2;
            }
            return 0;
        }
    }
