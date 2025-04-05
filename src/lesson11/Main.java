package lesson11;

public class Main {
    public static void main(String[] args) {

        Family family = new Family();

        // Create parents
        Human mother = new Woman("Alice", "Smith", 1988, 90, null, family);
        Human father = new Man("Bob", "Smith", 1984, 95, null, family);

        family.setMother(mother);
        family.setFather(father);


        Pet dog = new Dog("Buddy", 3, 75, new String[]{"barking", "playing"});
        family.setPet(dog);

        //methods:
        //mother and  father greet the pet:
        mother.greetPet();
        father.greetPet();

        System.out.println("\nUnique actions:");
        if (mother instanceof Woman) {
            ((Woman) mother).makeup();
        }
        if (father instanceof Man) {
            ((Man) father).repairCar();
        }

        // bornChild:
        System.out.println("\nA new child is born:");
        Human child = family.bornChild(mother, father);
        System.out.println("New child: " + child.getName() + " " + child.getSurname());



        // deleting a child
        System.out.println("\nDeleting the child...");
        family.deleteChild(0);
        System.out.println("Number of children after deletion: " + family.getChildren().length);

        System.out.println("\nAnother child is born.");
        Human secondChild = family.bornChild(mother, father);
        System.out.println("New child: " + secondChild.getName() + " " + secondChild.getSurname());


        // Test pet methods
        System.out.println("\nPet actions:");
        dog.respond();
        dog.eat();

        // Display family membrs:
        System.out.println("\nFamily members:");
        System.out.println("Mother: " + family.getMother().getName());
        System.out.println("Father: " + family.getFather().getName());
        System.out.println("Number of children: " + family.getChildren().length);
        System.out.println("Pet: " + family.getPet().getNickname());
    }
}

