package lesson03;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("dog", "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});

        Human mother = new Human("Jane", "Black", 1955);
        Human father = new Human("Vito", "Black", 1950);

        Human child = new Human("Michael", "Black", 1977, 90, pet, mother, father,
                new String[][]{{"Monday", "Gym"}, {"Tuesday", "Reading"}});


        System.out.println(mother);
        System.out.println(father);
        System.out.println(child);


        child.greetPet();
        child.describePet();
        pet.eat();
        pet.respond();
        pet.foul();


        boolean isFed = child.feedPet(false);
        System.out.println("Feeding happened: " + isFed);
    }
}
