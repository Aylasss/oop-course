package lesson16;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CourseManagement {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) {
        try {
            //initialize
            List<Student> students = createStudents();
            List<Teacher> teachers = createTeachers();
            List<Course> courses = createCourses(teachers);

            //enrollingincourse
            enrollStudents(students, courses);

            //grading exams
            List<Exam> exams = createAndGradeExams(students, courses);

            //exam results:
            printExamResults(exams);

            //saving to JSON
            saveDataToFiles(students, teachers, courses, exams);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static List<Student> createStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("A6GDW2", "Əli", "Əliyev"));
        students.add(new Student("S2EV3H", "Ayşə", "Həsənova"));
        students.add(new Student("8JDCE7", "Gülnur", "Məmmədzadə"));
        students.add(new Student("W1BZQ8", "Nihad", "Quliyev"));
        students.add(new Student("BSZ82V", "Huseyn", "Nebiyev"));
        return students;
    }

    private static List<Teacher> createTeachers() {
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("T2GX1T", "Prof. Kamil", "Əlizadə", "Mathematics"));
        teachers.add(new Teacher("7HSJ6S", "Prof. John", "Smith", "Computer Science"));
        return teachers;
    }

    private static List<Course> createCourses(List<Teacher> teachers) {
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("MATH101", "Calculus"));
        courses.add(new Course("CS101", "Programming"));

        teachers.get(0).teachCourse(courses.get(0));
        teachers.get(1).teachCourse(courses.get(1));

        return courses;
    }

    private static void enrollStudents(List<Student> students, List<Course> courses) {
        for (Student student : students) {
            for (Course course : courses) {
                student.enrollInCourse(course);
            }

        }
    }

    private static List<Exam> createAndGradeExams(List<Student> students, List<Course> courses) {
        List<Exam> exams = new ArrayList<>();
        Random random = new Random();

        for (Course course : courses) {
            if (course.enrolledStudents.isEmpty()) {
                System.out.println("No students enrolled in " + course.courseName);
                continue;

            }

            Exam exam = new Exam("EX" + course.courseId, course);
            exams.add(exam);

            for (Student student : course.enrolledStudents) {

                double score = 50 + random.nextInt(51);
                exam.recordScore(student, score);
                student.receiveGrade(course, score);
            }

        }

        return exams;
    }

    private static void printExamResults(List<Exam> exams) {
        for (Exam exam : exams) {
            System.out.println("\nExam: " + exam.course.courseName);
            System.out.println("Highest Score: " + exam.getMaxScore());
            System.out.println("Average Score: " + exam.calculateAverageScore());

            System.out.print("Top Students: ");
            List<Student> topStudents = exam.getTopStudents();
            for (int i = 0; i < topStudents.size(); i++) {
                if (i > 0) System.out.print(", ");
                System.out.print(topStudents.get(i).name + " " + topStudents.get(i).surname);
            }
            System.out.println();
        }

    }



    private static void saveDataToFiles(List<Student> students, List<Teacher> teachers,
                                        List<Course> courses, List<Exam> exams) throws Exception {
        mapper.writeValue(new File("students.json"), students);
        mapper.writeValue(new File("teachers.json"), teachers);
        mapper.writeValue(new File("courses.json"), courses);
        mapper.writeValue(new File("exams.json"), exams);

    }

}