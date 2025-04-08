package lesson16;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class Course {
    public String courseId;
    public String courseName;
    @JsonIgnore
    public Teacher teacher;
    public List<Student> enrolledStudents = new ArrayList<>();

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }


    //methods
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public boolean contains(Student student) {
        return enrolledStudents.contains(student);
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

}