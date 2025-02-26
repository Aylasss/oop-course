package lesson10;

abstract class Device {
    String brand;

    // constructor:
    Device(String brand) {
        this.brand = brand;
    }



    // Concrete method:
    void showBrand() {
        System.out.println("Device Brand: " + brand);
    }



    // Abstract methods:
    abstract void turnOn();
    abstract void turnOff();
}
