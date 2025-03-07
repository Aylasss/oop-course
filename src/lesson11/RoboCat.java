package lesson11;

public class RoboCat extends Pet {
    public RoboCat(String nickname, int age, int trickLevel, String[] habits){
        super(nickname, age, trickLevel, habits);
        this.species = Species.ROBO_CAT;
    }

    @Override
    public void respond() {
        System.out.println(nickname + " beeps.");
    }
}
