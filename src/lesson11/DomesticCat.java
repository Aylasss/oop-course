package lesson11;

public class DomesticCat extends Pet implements Foulable {
    public DomesticCat(String nickname, int age, int trickLevel, String[] habits){
        super(nickname, age, trickLevel, habits);
        this.species = Species.DOMESTIC_CAT;
    }

    @Override
    public void respond() {
        System.out.println(nickname + " purrs.");
    }


    @Override
    public void foul(){
        System.out.println(nickname + " scratched the furniture.");
    }
}
