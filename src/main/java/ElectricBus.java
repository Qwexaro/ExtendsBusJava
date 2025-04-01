public class ElectricBus extends Bus{
    private final double minimalTankFullnessRate;

    public ElectricBus(double fuelConsumption, double minimalTankFullnessRate) {
        super(fuelConsumption);
        this.minimalTankFullnessRate = minimalTankFullnessRate;
    }
}
