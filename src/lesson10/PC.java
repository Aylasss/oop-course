package lesson10;

public class PC extends Device {
    public PC (String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " PC is booting up.");
    }


    @Override
    public void turnOff() {
        System.out.println(brand + " PC is shutting down.");
    }
}
