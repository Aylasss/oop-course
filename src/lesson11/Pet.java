package lesson11;

public abstract class Pet {
    protected Species species;
    protected String nickname;
    protected int age;
    protected int trickLevel;
    protected String[] habits;

    // Contructor:
    public Pet(String nickname, int age, int trickLevel, String[] habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    // Methods:

    public void eat(){
        System.out.println("I am eating...");
    }

    public abstract void respond();

    public String getNickname() {
        return nickname;
    }
}
