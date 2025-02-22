package lesson07;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Human {
    //static block:
    static{
        System.out.println("Human class is being loaded.");
    }

    //non-static block:
    {
        System.out.println("A Human object is created.");
    }

    private String name;
    private String surname;
    private int year;
    private int iq; // 1-100
    private String[][] schedule;
    private Family family;

    //Local variables for mother, father, and pet to use directly:
    private Pet pet;
    private Human mother;
    private Human father;
    private Human[] children;




    // Constructors:

    // empty one for tests:
    public Human () { };

    public Human(String name, String surname, int year, int iq, String[][] schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
        this.family=family;

        //Initializing pet from family

        if(family != null){
            this.mother = family.getMother();
            this.father = family.getFather();
            this.pet = family.getPet();
            this.children = family.getChildren();
        }

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
            System.out.println("I have a " + pet.getSpecies() + ", it is " + pet.getAge() + " years old, it is " + slyness + ".");
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
            System.out.println("Hm... I will feed " + this.name  + "'s " + pet.getSpecies());
            return true;
        } else {
            System.out.println("I think " + pet.getNickname() + " is not hungry.");
            return false;
        }
    }


    //toString:

    @Override
    public String toString() {
        return "Human{name = '" + name + "', surname = '" + surname + "', year = " + year + ", iq = " + iq + ", schedule = " + Arrays.deepToString(schedule) +"}";
    }



    //Getters & Setter:

    public String getName(){
        return name;
    }


    public String getSurname(){
        return surname;
    }


    public int getYear(){
        return year;
    }


    public int getIq(){
        return iq;
    }

    public void setIq(int iq){
        this.iq=iq;
    }


    public String[][] getSchedule(){
        return schedule;
    }

    public void setSchedule(String[][] schedule){
        this.schedule=schedule;
    }


    public Family getFamily(){
        return family;
    }


    // equals() and hashCode():
    @Override
    public boolean equals( Object object ){
        if (this == object) return true;
        if (object == null || getClass()!=object.getClass()) return false;
        Human human = (Human) object; // object is casted here
        return year == human.getYear() && name.equals(human.getName()) && surname.equals(human.getSurname());
    }

    @Override
    public int hashCode(){
        int hash = Objects.hash(name, surname, year, iq, mother, father, pet);
        hash = 31 * hash + Arrays.deepHashCode(schedule);
        return hash;
    }


    // finalize() method:
    protected void finalize() throws Throwable{
        throw new UnsupportedOperationException("finalize() method is not supported in this class.");
    }


}
