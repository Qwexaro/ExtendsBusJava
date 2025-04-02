public class ElectricBus extends Bus {
    private final double minimalTankFullnessRate;

    public ElectricBus(double fuelConsumption, double minimalTankFullnessRate) {
        super(fuelConsumption);
        this.minimalTankFullnessRate = minimalTankFullnessRate;
    }

    @Override
    public int drivingDistance() {

        double remainderBatteryFullness = tankFullnessRate - minimalTankFullnessRate;

        if (remainderBatteryFullness <= 0) {
            return 0;
        }


        return (int) (remainderBatteryFullness / consumptionRate);
    }
}
