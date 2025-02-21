package lesson07;

public enum Species {

    //Species(numberoflegs, hasfur, canfly)

    DOG(4, true, false),
    CAT(4, true, false),
    BIRD(2, false, true),
    FISH(0, false, false);

    private final int numberOfLegs;
    private final boolean hasFur;
    private final boolean canFly;

    Species(int numberOfLegs, boolean hasFur, boolean canFly){
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
        this.canFly = canFly;
    }

    @Override

    public String toString () {
        return name() + " with " + numberOfLegs + " legs, can fly: " + canFly + ", has fur: " + hasFur;
    }

}
