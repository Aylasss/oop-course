package lesson10;

class PC extends Device {
    PC (String brand) {
        super(brand);
    }

    @Override
    void turnOn() {
        System.out.println(brand + " PC is booting up.");
    }


    @Override
    void turnOff() {
        System.out.println(brand + " PC is shutting down.");
    }
}
