package lesson13.task2;

import java.time.LocalDate;


public class Student implements Comparable<Student> {

    private int id;
    private String name;
    private String surname;
    private double grade;
    private String gender; // Assume "Female" or "Male"
    private LocalDate birthdate;

    //constructor:

    public Student(int id, String name, String surname, double grade, String gender, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.gender = gender;
        this.birthdate = birthdate;

    }


    //sorting by id (ascending):
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", surname='" + surname + '\'' + ", grade=" + grade + ", gender='" + gender + '\'' + ", birthdate=" + birthdate + '}';
    }


    //getters and setters:

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getGrade() {
        return grade;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }


}
