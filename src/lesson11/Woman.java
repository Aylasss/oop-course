package lesson11;

public class Woman extends Human {

    public Woman(String name, String surname, int year, int iq, String[][] schedule, Family family){
        super(name, surname, year, iq, schedule, family);
    }




    // Methods:

    @Override
    public void greetPet() {
        if(getFamily().getPet() != null) {
            System.out.println("Hello sweetie!");
        }

        else {
            System.out.println("I don't have any pet.");
        }
    }

    // unique method for women:
    public void makeup(){
        System.out.println("I'm doing makeup.");
    }
}
