package lesson10;

class TV extends Device {
    TV(String brand) {
        super(brand);
    }

    @Override
    void turnOn() {
        System.out.println(brand + " TV is powering up.");
    }

    @Override
    void turnOff() {
        System.out.println(brand + " TV is turning off.");
    }
}