package lesson16;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends Human {
    @JsonIgnore
    public List<Course> enrolledCourses = new ArrayList<>();
    @JsonIgnore
    public Map<Course, Double> grades = new HashMap<>();


    public Student(String id, String name, String surname){
        super(id, name, surname);
    }

    //methods
    public void enrollInCourse(Course course){
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.enrollStudent(this);
        }
    }

    public void receiveGrade(Course course, double grade){
        if(grade<0 || grade > 100 ){
            throw new IllegalArgumentException("Invalid input. Grade must be between 0 and 100.");
        }
        grades.put(course, grade);
    }
}
