package lesson11;

public class Human {

    //static block:
    static{
        System.out.println("Human class is being loaded.");
    }

    //non-static block:
    {
        System.out.println("A Human object is created.");
    }

    private String name;
    private String surname;
    private int year;
    private int iq; // 1-100
    private String[][] schedule;
    private Family family;


    //Local variables for mother, father, and pet to use directly:
    private Pet pet;
    private Human mother;
    private Human father;
    private Human[] children;


    // Constructors:

    // empty one for tests:
    public Human () { };

    public Human(String name, String surname, int year, int iq, String[][] schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
        this.family=family;

        //Initializing pet from family

        if(family != null){
            this.mother = family.getMother();
            this.father = family.getFather();
            this.pet = family.getPet();
            this.children = family.getChildren();
        }

    }



    // Methods:

    public void greetPet() {
        if(pet != null) {
            System.out.println("Hello, pet!");
        }

        else {
            System.out.println("I don't have any pet.");
        }
    }






    //Getters & Setter:

    public String getName(){
        return name;
    }


    public String getSurname(){
        return surname;
    }


    public int getYear(){
        return year;
    }


    public int getIq(){
        return iq;
    }

    public void setIq(int iq){
        this.iq=iq;
    }


    public String[][] getSchedule(){
        return schedule;
    }

    public void setSchedule(String[][] schedule){
        this.schedule=schedule;
    }


    public Family getFamily(){
        return family;
    }
}
