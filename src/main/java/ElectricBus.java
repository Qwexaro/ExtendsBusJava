public class ElectricBus extends Bus {
    private final double minimalTankFullnessRate;

    private static int count = 0;
    public ElectricBus(double fuelConsumption, double minimalTankFullnessRate) {
        super(fuelConsumption);
        this.minimalTankFullnessRate = minimalTankFullnessRate;
        count++;
    }

    public static int getCount(){
        return count;
    }

    @Override
    public int drivingDistance() {

        double remainderBatteryFullness = tankFullnessRate - minimalTankFullnessRate;

        if (remainderBatteryFullness <= 0) {
            return 0;
        }


        return (int) (remainderBatteryFullness / consumptionRate);
    }

    public double getMinimalTankFullnessRate() {
        return minimalTankFullnessRate;
    }
}
