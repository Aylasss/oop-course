package lesson11;

public class Man extends Human{
    public Man(String name, String surname, int year, int iq, String[][] schedule, Family family){
        super(name, surname, year, iq, schedule, family);
    }

    // Methods:

    @Override
    public void greetPet() {
        if(getFamily().getPet() != null) {
            System.out.println("Hello buddy, how's it going?");
        }

        else {
            System.out.println("I don't have any pet.");
        }
    }

    // unique method for men:
    public void repairCar(){
        System.out.println("I'm repairing a car.");
    }

}
