package lesson03;
pac

public class Human {

    public String name;
    public String surname;
    public int year;
    public int iq;
    public Pet pet;
    public Human mother;
    public Human father;
    public Schedule[][] schedule;


    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father ){
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iq=iq;
        this.pet=pet;
        this.mother=mother;
        this.father=father;
        this.schedule=schedule;
    }


    //methods
    public void greetPet(){
        System.out.println("Hello, "+ pet.nickname);
    }


//    public void describePet(){
//        System.out.println("I have a " +pet.species+"is"+pet.age+"years old, he is"+)
//    }










}
