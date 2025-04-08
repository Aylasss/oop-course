package lesson16;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId;
    private String courseName;
    private Teacher teacher;
    private List<Student> enrolledStudents = new ArrayList<>();

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    //methods
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        student.enrollInCourse(this);
    }

    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }


    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}
