package lesson05;
import lesson05.Human;
import lesson05.Pet;

import java.util.Arrays;

public class Family {

    //static block:
    static{
        System.out.println("Family class is being loaded.");
    }

    //non-static block:
    {
        System.out.println("A Family object is created.");
    }

    private final Human mother;
    private final Human father;
    private Human[] children;
    private Pet pet;


    //Constructor:

    public Family(Human mother, Human father, Pet pet){
        this.mother=mother;
        this.father=father;
        this.children=new Human[0]; //empty children array
        this.pet = pet;
    }


    //Methods:
    public void addChild(Human child){
        Human[] newChildren = Arrays.copyOf(children,children.length + 1);
        newChildren[children.length] = child;
        children=newChildren;
        System.out.println("The child is added successfully!");
    }


    // deleting by an index:
    public void deleteChild(int index){
        if ( index >= 0 && index <= (children.length - 1)){
            Human[] newChildren = new Human[children.length - 1];
            int j=0;
            for(int i=0; i< children.length; i++) {
                if (i != index) {
                    newChildren[j++] = children[i];
                }
            }
            children = newChildren;
            System.out.println("The child is deleted successfully!");
            }
            System.out.println("Invalid input for index");
        }



   //deleting by Human object:
    public void deleteChild(Human child) {
        for (int i = 0; i < children.length; i++){
            if (children[i].equals(child)){
                Human[] newChildren = new Human[children.length-1];
                int t = 0;
                for(int j=0; j < children.length; j++){
                    if(j != i) {
                        newChildren[t++] = children[j];
                    }
                }
                children = newChildren;
                System.out.println("This child is deleted successfully");
            }
        }

        System.out.println("Invalid input for child");
    }


    public int countFamily(){
        int count = 2; // mother + father

        if(children != null){
            count += children.length;
        }

        if (pet != null){
            count += 1;
        }

        return count;
    }



    //Getters & Setters:

    public Human getMother(){
        return mother;
    }


    public Human getFather(){
        return father;
    }


    public Human[] getChildren(){
        return children;
    }



    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }



    //toString

    @Override
    public String toString(){
        return "Family{" + "mother=" + mother + ";\nfather=" + father + ";\nchildren=" + Arrays.toString(children) + ";\npet=" + pet + '}';
    }
}
