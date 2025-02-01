package hw2;

public class Student {



    public String name;
    public int age;
    public String major;
    private double gpa;


    public Student(String name, int age,  String major, double gpa)
    {
        this.age=age;
        this.name=name;
        this.major=major;
        this.gpa=gpa;

    }


    public void study()
    {
        System.out.println(name+"is studying");
    }


    public void addgrade(int grade)
    {
        System.out.println(name+"'s grade: "+ grade);

    }



    public void isSuccessful()
    {
        System.out.println(name+"is successful");
    }

}
