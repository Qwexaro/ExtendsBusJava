public class Bus {

    private static int count;
    protected double tankFullnessRate;

    protected final double consumptionRate;

    private int countBuses;

    public Bus(double consumptionRate) {
        this.consumptionRate = consumptionRate;
        countBuses++;
        count++;
    }

    public final void refuel(double countLiters) {
        double total = tankFullnessRate + countLiters;
        tankFullnessRate = total > 95 ? 95 : total;
    }

    public int drivingDistance() {
        return (int) (tankFullnessRate / consumptionRate);
    }

    public boolean run(int distance) {
        if (drivingDistance() < distance) {
            return false;
        }

        tankFullnessRate -= consumptionRate * distance;
        return true;
    }

    public double getTankFullnessRate() {
        return tankFullnessRate;
    }

    public static int getCountBases() {
        return count;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "tankFullnessRate=" + tankFullnessRate +
                ", fuelConsumption=" + consumptionRate +
                ", countBuses=" + countBuses +
                '}';
    }
}
