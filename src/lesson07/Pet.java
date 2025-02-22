package lesson07;

import java.util.Objects;
import java.util.Arrays;

public class Pet {

    //static block:
    static{
        System.out.println("Pet class is being loaded.");
    }

    //non-static block:
    {
        System.out.println("A Pet object is created.");
    }

    private Species species;
    private String nickname;
    private int age;
    private int trickLevel; // 1-100
    private String[] habits;


    // Constructors:

    // empty one for tests:
    public Pet() { };

    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }



    // Methods:

    public void eat() {
        System.out.println("I'm eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am " + this.nickname + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }



    // Getters & Setters:


    public String getNickname() {
        return nickname;
    }


    public Species getSpecies() {
        return species;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel){
        this.trickLevel=trickLevel;
    }


    public String[] getHabits(){
        return habits;
    }

    public void setHabits(String[] habits){
        this.habits=habits;
    }



    //toString:
    @Override
    public String toString() {
        return species + " {nickname = '" + nickname + "', age = " + age + ", trickLevel = " + trickLevel + ", habits = " + Arrays.toString(habits) + "}";
    }

    //equals() & hashCode():

    @Override
    public boolean equals(Object object) {
        if(this == object ) return true;
        if(object == null || getClass() != object.getClass() ) return false;

        Pet pet =(Pet) object;
        return age == pet.getAge() && species == pet.getSpecies() && nickname.equals(pet.getNickname());
    }

    @Override
    public int hashCode() {
        int hash = species.hashCode();
        hash = 31 * hash + nickname.hashCode();
        hash = 31 * hash + age;
        return hash;
    }



    //finalize() method:

    @Override

    protected void finalize() throws  Throwable{
        throw new UnsupportedOperationException("finalize() method is not supported in this class.");
    }



}
