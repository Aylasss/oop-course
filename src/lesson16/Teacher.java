package lesson16;

import java.time.LocalDate;
import java.util.ArrayList;

public class Teacher extends Human implements Teachable{
    private String department;
    private List<Course> coursesTaught = new ArrayList<>();

    public Teacher(String id, String name, String surname, LocalDate birthDate, String department){
        super(id, name, surname, birthDate);
        this.department = department;
    }

    //methods

    @Override
    public void teachCourse(Course course){
        coursesTaught.add(course);
        course.setTeacher(this);
    }
}
