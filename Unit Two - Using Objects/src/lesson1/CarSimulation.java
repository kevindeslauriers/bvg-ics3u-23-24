package lesson1;

public class CarSimulation {
    public static void main(String[] args) {
        Car jeep = new Car("Jeep", "Cherokee", 2022, 1203.5);
        Car smallCar = new Car("Hyundai", "Kona", 2023, 11000.10);

        jeep.drive(100.7);
        smallCar.printCarInfo();

    }
}
