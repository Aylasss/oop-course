package lesson03;
import java.util.Arrays;

public class Pet {

    public String species;
    public String nickname;
    public int age;
    public int trickLevel; // 1-100
    public String[] habits;


    // Constructors:

    public Pet() {}

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

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


    //toString:
    @Override
    public String toString() {
        return species + "{nickname='" + nickname + "', age=" + age + ", trickLevel=" + trickLevel + ", habits=" + Arrays.toString(habits) + "}";
    }



    // I added getters & setters:


    public String getNickname() {
        return nickname;


    }


    public String getSpecies() {
        return species;
    }


    public int getTrickLevel() {
        return trickLevel;
    }
}
