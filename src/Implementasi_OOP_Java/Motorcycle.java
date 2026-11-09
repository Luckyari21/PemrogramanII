package Implementasi_OOP_Java;

public class Motorcycle extends Vehicle implements Rentable{
    public Motorcycle(String brand){
        super(brand);
    }

    @Override
    public void start(){
        System.out.println("Motor tersedia.");
    }

    @Override
    public int calculateRent(int days){
        return 50000 * days;
    }
}