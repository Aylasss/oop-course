package lesson10;

public class TV extends Device {
    public TV(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " TV is powering up.");
    }

    @Override
    public void turnOff() {
        System.out.println(brand + " TV is turning off.");
    }
}