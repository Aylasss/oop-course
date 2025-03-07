package lesson11;

public enum Species {
    FISH(0, false, false),
    DOMESTIC_CAT(4, false, true),
    DOG(4, false, true),
    ROBO_CAT(4, false, false),
    UNKNOWN(0, false, false);


    private final int numberOfLegs;
    private final boolean canFly;
    private final boolean hasFur;

    //Constructor:
    Species(int numberOfLegs, boolean canFly, boolean hasFur) {
        this.numberOfLegs = numberOfLegs;
        this.canFly = canFly;
        this.hasFur = hasFur;
    }

    //toString

    @Override

    public String toString() {
        return name() + "with " + numberOfLegs + " legs, can fly: " + canFly + ", has fur: " + hasFur;
    }

}
