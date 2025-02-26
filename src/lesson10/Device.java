package lesson10;

public abstract class Device {
    String brand;

    // constructor:
    public Device(String brand) {
        this.brand = brand;
    }



    // Concrete method:
    public void showBrand() {
        System.out.println("Device Brand: " + brand);
    }



    // Abstract methods:
    public abstract void turnOn();
    public abstract void turnOff();
}
