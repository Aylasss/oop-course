package lesson10;

public class Phone extends Device {
    public Phone(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " Phone is turning on.");
    }

    @Override
    public void turnOff() {
        System.out.println(brand + " Phone is shutting down.");
    }
}

