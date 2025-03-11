package lesson12;

public class Player {
    public final String name;
    public final int score;

    public Player( String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString(){
        return "{name: " + this.name + " score: " + this.score + "}";
    }


}
