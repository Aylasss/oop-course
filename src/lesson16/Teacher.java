package lesson16;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends Human implements Teachable{
    public String department;
    @JsonIgnore
    public List<Course> coursesTaught = new ArrayList<>();

    public Teacher(String id, String name, String surname, String department){
        super(id, name, surname);
        this.department = department;
    }

    //methods

    @Override
    public void teachCourse(Course course){
        coursesTaught.add(course);
        course.setTeacher(this);
    }
}
