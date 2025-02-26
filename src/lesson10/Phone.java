package lesson10;

class Phone extends Device {
    Phone(String brand) {
        super(brand);
    }

    @Override
    void turnOn() {
        System.out.println(brand + " Phone is turning on.");
    }

    @Override
    void turnOff() {
        System.out.println(brand + " Phone is shutting down.");
    }
}

