package lesson10;

public class Main {
    public static void main(String[] args) {
        // Creating devices:
        Phone myPhone = new Phone("Samsung");
        TV myTV = new TV("LG");
        PC myPC = new PC("Asus");

        // Phone:
        myPhone.showBrand();
        myPhone.turnOn();
        myPhone.turnOff();

        System.out.println();


        // TV:
        myTV.showBrand();
        myTV.turnOn();
        myTV.turnOff();
        System.out.println();


        // PC:
        myPC.showBrand();
        myPC.turnOn();
        myPC.turnOff();
    }
}