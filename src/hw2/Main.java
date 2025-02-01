package hw2;

public class Main {
    public static void main(String[] args) {
        StudentManagement Smanagement = new StudentManagement(5);


        Smanagement.addStudent("John", 20, "Computer Science", 90.6);
        Smanagement.addStudent("Alice", 21, "Mathematics", 78.5);

        Smanagement.displayStudents();




        Smanagement.removeStudent("Alice");

        //after change:
        Smanagement.displayStudents();
    }
}