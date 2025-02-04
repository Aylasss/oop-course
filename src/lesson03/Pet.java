package lesson03;

import hw2.Student;

public class Pet {

    public String species;
    public String nickname;
    public int age;
    public int trickLevel;
    public Habit[] habits;
    public int habitCount=5;

    public Pet(String species, String nickname, int age, int trickLevel, int habitCount )
    {
        habits=new Habit[habitCount];
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.trickLevel=trickLevel;


    }

    //methods

        public void eat(){
        System.out.println("I'm eating");
        }

        public void respond (){
        System.out.println("Hello, owner. I am "+ nickname);
        }


        public void foul (){
        System.out.println("I need to cover it up");
        }





}
