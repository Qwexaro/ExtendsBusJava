public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(0.300);
        bus.refuel(100);
        System.out.println("Bus: ");
        System.out.println("Осталось: " + bus.getTankFullnessRate() + " л топлива");
        System.out.println("На " + bus.drivingDistance() + " км хватит топлива");
        System.out.println("Едем 310 км: " + bus.run(310));
        System.out.println("Осталось: " + bus.getTankFullnessRate() + " л топлива");
        System.out.println("На " + bus.drivingDistance() + " км хватит топлива");

        System.out.println("Едем 4 км: " + bus.run(4));
        System.out.println("Осталось: " + bus.getTankFullnessRate() + " л топлива");
        System.out.println("На " + bus.drivingDistance() + " км хватит топлива");


        ElectricBus electricBus = new ElectricBus(0.300, 9.5);
        electricBus.refuel(100);
        System.out.println("\nElectro Bus: ");
        System.out.println("Осталось: " + electricBus.getTankFullnessRate() + " зарядов топлива");
        System.out.println("На " + electricBus.drivingDistance() + " км хватит топлива");
        System.out.println("Едем 310 км: " + electricBus.run(310));
        System.out.println("Осталось: " + electricBus.getTankFullnessRate() + " зарядов топлива");
        System.out.println("На " + electricBus.drivingDistance() + " км хватит топлива");

        System.out.println("Едем 4 км: " + electricBus.run(4));
        System.out.println("Осталось: " + electricBus.getTankFullnessRate() + " зарядов топлива");
        System.out.println("На " + electricBus.drivingDistance() + " км хватит топлива");
    }
}
