public class Main {
    public static void main(String[] args) {
//        Bus bus = new Bus(0.300);
//        bus.refuel(100);
//        System.out.println("Bus: ");
//        System.out.println("Осталось: " + bus.getTankFullnessRate() + " л топлива");
//        System.out.println("На " + bus.drivingDistance() + " км хватит топлива");
//        System.out.println("Едем 310 км: " + bus.run(310));
//        System.out.println("Осталось: " + bus.getTankFullnessRate() + " л топлива");
//        System.out.println("На " + bus.drivingDistance() + " км хватит топлива");
//
//        System.out.println("Едем 4 км: " + bus.run(4));
//        System.out.println("Осталось: " + bus.getTankFullnessRate() + " л топлива");
//        System.out.println("На " + bus.drivingDistance() + " км хватит топлива");
//
//        ElectricBus electricBus = new ElectricBus(0.300, 9.5);
//        electricBus.refuel(100);
//        System.out.println("\nElectro Bus: ");
//        System.out.println("Осталось " + electricBus.getTankFullnessRate() + " единиц заряда!");
//        System.out.println("Осталось: " + electricBus.getTankFullnessRate() + " зарядов топлива");
//        System.out.println("На " + electricBus.drivingDistance() + " км хватит топлива");
//        System.out.println("Едем 310 км: " + electricBus.run(310));
//        System.out.println("Осталось: " + electricBus.getTankFullnessRate() + " зарядов топлива");
//        System.out.println("На " + electricBus.drivingDistance() + " км хватит топлива");
//
//        System.out.println("Едем 4 км: " + electricBus.run(4));
//        System.out.println("Осталось: " + electricBus.getTankFullnessRate() + " зарядов топлива");
//        System.out.println("На " + electricBus.drivingDistance() + " км хватит топлива");

        Bus firstBus = new Bus(0.300);
        Bus secondBus = new Bus(0.300);
        Bus thirdBus = new Bus(0.300);

        ElectricBus firstElectricBus = new ElectricBus(0.300, 9.5);
        ElectricBus secondElectricBus = new ElectricBus(0.300, 9.5);

        System.out.println("К-во всех автобусов: " + Bus.getCountBases());
        System.out.println("К-во всех электробусов: " + ElectricBus.getCount());
    }
}
