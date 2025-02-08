package lesson03;
import java.util.Random;

public class Human {
    public String name;
    public String surname;
    private int year;
    private int iq; // 1-100
    private Pet pet;
    public Human mother;
    public Human father;
    private String[][] schedule;



    // Constructors:
    public Human() { }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;

    }




    // Methods:

    public void greetPet() {
        if (pet != null) {
            System.out.println("Hello, " + pet.getNickname());
        }

        else {
            System.out.println("I don't have a pet to greet.");
        }
    }

    public void describePet() {
        if (pet != null) {
            String slyness = pet.getTrickLevel() > 50 ? "very sly" : "almost not sly";
            System.out.println("I have a " + pet.getSpecies() + ", it is " + pet.age + " years old, it is " + slyness + ".");
        }


        else {
            System.out.println("I dont have a pet to describe.");
        }
    }

    public boolean feedPet (boolean isTimeToFeed) {
        if (pet ==null) {
            System.out.println("I don't have a pet to feed.");

            return false;
        }



        Random random = new Random();

        int randNumber = random.nextInt(101);


        if (isTimeToFeed || pet.getTrickLevel() > randNumber) {
            System.out.println("Hm... I will feed " + name + "'s " + pet.getSpecies());
            return true;
        } else {
            System.out.println("I think " + pet.getNickname() + " is not hungry.");
            return false;
        }
    }


    //toString:

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq + ", mother=" + (mother != null ? mother.name + "  " + mother.surname : "null") + ", father=" + (father != null ? father.name + " " + father.surname : "null") + ", pet=" + (pet != null ? pet.toString() : "null") + "}";
    }
}
