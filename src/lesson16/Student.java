package lesson16;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Student extends Human {
    private List<Course> enrolledCourses = new ArrayList<>();
    private Map<Course, Double> grades = new HashMap<>();


    public Student(String id, String name, String surname, LocalDate birthDate){
        super(id, name, surname, birthDate);
    }

    //methods
    public void enrollInCourse(Course course){
        enrolledCourses.add(course);
    }

    public void receiveGrade(Course course, double grade){
        if(grade<0 || grade > 100 ){
            throw new IllegalArgumentException("Invalid input. Grade must be between 0 and 100.");
        }
        grade.put(course, grade);
    }
}
