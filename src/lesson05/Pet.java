package lesson05;

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

    private final String species;
    private final String nickname;
    private int age;
    private int trickLevel; // 1-100
    private String[] habits;


    // Constructor:

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
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


    public String getSpecies() {
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
        return species + "{nickname='" + nickname + "', age=" + age + ", trickLevel=" + trickLevel + ", habits=" + Arrays.toString(habits) + "}";
    }



}
