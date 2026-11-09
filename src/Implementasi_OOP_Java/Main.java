package Implementasi_OOP_Java;

public class Main {
    public static void main(String[] args) {
        Vehicle motorcycle = new Motorcycle("Honda");
        Vehicle car = new Car("Toyota");

        motorcycle.showBrand();
        motorcycle.start();
        System.out.println("Biaya penyewaan motor: Rp" +
                ((Rentable) motorcycle).calculateRent(2));

        System.out.println();

        car.showBrand();
        car.start();
        System.out.println("Biaya penyewaan mobil: Rp" +
                ((Rentable) car).calculateRent(2));
    }
}