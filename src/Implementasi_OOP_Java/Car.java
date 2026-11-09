package Implementasi_OOP_Java;

public class Car extends Vehicle implements Rentable {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Mobil tersedia.");
    }

    @Override
    public int calculateRent(int days) {
        return 200000 * days;
    }
}