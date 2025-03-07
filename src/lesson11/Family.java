package lesson11;

import java.util.Arrays;
import java.util.Random;
import java.time.LocalDate;
import java.util.Arrays;

public class Family implements HumanCreator {

    //static block:
    static {
        System.out.println("Family class is being loaded.");
    }

    //non-static block:
    {
        System.out.println("A Family object is created.");
    }

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    private static final String[] BOY_NAMES = { "James", "John", "Liam", "Noah", "Oliver", "Elijah", "William", "Benjamin", "Lucas", "Henry", "Alexander", "Jack", "Daniel", "Michael", "Matthew", "Samuel", "Joseph", "David", "Ethan", "Isaac", "Mason", "Leo", "Nathan", "Aaron", "Dylan"};
    private static final String[] GIRL_NAMES = {"Emma", "Sophia", "Olivia", "Mia", "Isabella", "Amelia", "Harper", "Evelyn", "Abigail", "Charlotte", "Lily", "Aria", "Grace", "Zoe", "Chloe", "Ella", "Victoria", "Scarlett", "Madison", "Luna", "Avery", "Ellie", "Ariana", "Stella"};
    Random random = new Random();
    static int currentYear = LocalDate.now().getYear();


    //Constructors:

    // Initializing children array:
    public Family() {
        this.children = new Human[0];
    }

    // Family with only 2 members:
    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
    }

    public Family(Human mother, Human father, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
        this.pet = pet;
    }


    // Methods:
    @Override
    public Human bornChild(Human mother, Human father) {
        // Randomly determine gender
        boolean isFemale = random.nextBoolean();

        // Randomly select a name
        String name = isFemale ? GIRL_NAMES[random.nextInt(GIRL_NAMES.length)] : BOY_NAMES[random.nextInt(BOY_NAMES.length)];


        double iq = (mother.getIq() + father.getIq()) / 2;

        // Create a child
        Human child;
        if (isFemale) {
            child = new Woman(name, father.getSurname(), currentYear, (int) iq, null, this);
        } else {
            child = new Man(name, father.getSurname(), currentYear, (int) iq, null, this);
        }

        // Adding this child:
        addChild(child);
        return child;
    }

    //Adding a child:
    public void addChild(Human child) {
        Human[] newChildren = Arrays.copyOf(children, children.length + 1);
        newChildren[children.length] = child;
        children = newChildren;
        System.out.println("The child is added successfully.");
    }

    // deleting by an index:
    public void deleteChild(int index) {
        if (index >= 0 && index <= (children.length - 1)) {
            Human[] newChildren = new Human[children.length - 1];
            int j = 0;
            for (int i = 0; i < children.length; i++) {
                if (i != index) {
                    newChildren[j++] = children[i];
                }
            }
            children = newChildren;
            System.out.println("The child is deleted successfully!");
        } else {
            System.out.println("Invalid input for index");
        }
    }


    //deleting by Human object:
    public void deleteChild(Human child) {
        boolean flag = false;
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(child)) {
                Human[] newChildren = new Human[children.length - 1];
                int t = 0;
                for (int j = 0; j < children.length; j++) {
                    if (j != i) {
                        newChildren[t++] = children[j];
                    }
                }
                children = newChildren;
                System.out.println("This child is deleted successfully");
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Invalid input for child");
        }
    }









    //Getters & Setters:

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }


    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }


    public Human[] getChildren() {
        return children;
    }


    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }



}
