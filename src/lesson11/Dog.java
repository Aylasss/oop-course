package lesson11;

public class Dog extends Pet implements Foulable {
    public Dog(String nickname, int age, int trickLevel, String[] habits){
        super(nickname, age, trickLevel, habits);
        this.species = Species.DOG;
    }

    @Override
    public void respond(){
        System.out.println(nickname + " wags its tail.");
    }


    @Override
    public void foul(){
        System.out.println(nickname + " dug a hole in the yard.");
    }
}
