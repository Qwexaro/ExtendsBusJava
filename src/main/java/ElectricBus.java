public class ElectricBus extends Bus {
    private final double minimalTankFullnessRate;

    public ElectricBus(double fuelConsumption, double minimalTankFullnessRate) {
        super(fuelConsumption);
        this.minimalTankFullnessRate = minimalTankFullnessRate;
    }

    public boolean run(int distance) {
        if (drivingDistance() < distance) {
            return false;
        }

        if (tankFullnessRate < minimalTankFullnessRate) {
            return false;
        }

        tankFullnessRate -= fuelConsumption * distance;
        return true;
    }
}
