package lesson07;

public class Main {

    public static void main(String[] args) {

        // Creating many Human objects:

        System.out.println("Creating Human objects...");
        for (int i=0; i<=10; i++){
            Human human = new Human ();
            human = null;
            if(i%5 == 0) {
                System.gc();
            }
        }






        /*
        //Creating parents:
        System.out.println("Creating Human objects...");
        Human mother = new Human();
        Human father = new Human();


        //Creating pet:
        System.out.println("\nCreating Pet objects...");
        Pet pet = new Pet();



        //Creating family:
        System.out.println("\nCreating Family objects ...");
        Family family1 = new Family ();


        family1 = null;

        System.gc();
        System.out.println("End of program");


        // Creating Child's Schedule:
        String[][] schedule = {
                {DayOfWeek.MONDAY.name(), "Go to school"},
                {DayOfWeek.TUESDAY.name(), "Soccer practice"},
                {DayOfWeek.WEDNESDAY.name(), "Piano lesson"},
                {DayOfWeek.THURSDAY.name(), "Math tutoring"},
                {DayOfWeek.FRIDAY.name(), "Movie night"},
                {DayOfWeek.SATURDAY.name(), "Visit grandparents"},
                {DayOfWeek.SUNDAY.name(), "Relax"}
        };



        // Creating a Child:
        Human child1 = new Human();
        Human child2 = new Human();


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

*/

    }
}
