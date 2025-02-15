package lesson05;

public class Main {
    public static void main(String[] args) {
        //Creating parents:
        System.out.println("Creating Human objects...");
        Human mother = new Human("Alice", "Smith", 1980, 90, null, null);
        Human father = new Human("Bob", "Smith", 1977, 85, null, null);

        //Creating pet:
        System.out.println("\nCreating Pet objects...");
        Pet pet = new Pet("Dog", "Rex", 3, 80, new String[]{"eat", "sleep", "play"});

        //Creating family:
        System.out.println("\nCreating Family objects ...");
        Family family1 = new Family (mother, father, pet);

        // Creating Child's Schedule:
        String[][] schedule = {
                {"Monday", "Go to school"},
                {"Tuesday", "Soccer practice"},
                {"Wednesday", "Piano lesson"},
                {"Thursday", "Math tutoring"},
                {"Friday", "Movie night"},
                {"Saturday", "Visit grandparents"},
                {"Sunday", "Relax"}
        };

        // Creating a Child:
        Human child1 = new Human("Charlie", "Smith", 2009, 76, schedule, family1);
        Human child2 = new Human("Jane", "Smith", 2004, 87, schedule, family1);


        // Adding childs:
        System.out.println("\nADDING CHILD...");
        family1.addChild(child1);
        family1.addChild(child2);



        System.out.println();
        System.out.println(family1);

        // Deleting a child by Human object:
        System.out.println("\nDELETING CHILD...");
        family1.deleteChild(child2);
        System.out.println("\nAfter deleting: ");
        System.out.println(family1);



    }
}
