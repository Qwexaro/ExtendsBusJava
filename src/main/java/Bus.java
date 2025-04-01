public class Bus {

    protected double tankFullnessRate;

    protected final double fuelConsumption;

    private int countBuses;

    public Bus(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
        countBuses++;
    }

    public void refuel(double countLiters) {
        double total = tankFullnessRate + countLiters;
        tankFullnessRate = total > 95 ? 95 : total;
    }

    public int drivingDistance() {
        return (int) (tankFullnessRate / fuelConsumption);
    }

    public boolean run(int distance) {
        if (drivingDistance() < distance) {
            return false;
        }

        tankFullnessRate -= fuelConsumption * distance;
        return  true;
    }

    public double getTankFullnessRate() {
        return tankFullnessRate;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "tankFullnessRate=" + tankFullnessRate +
                ", fuelConsumption=" + fuelConsumption +
                ", countBuses=" + countBuses +
                '}';
    }
}
