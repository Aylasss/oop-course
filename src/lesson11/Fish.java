package lesson11;

public class Fish extends Pet {
    public Fish(String nickname, int age, int trickLevel, String[] habits){
        super(nickname, age, trickLevel, habits);
        this.species = Species.FISH;
    }

    @Override

    public void respond() {
        System.out.println(nickname + " swims silently.");
    }
}
