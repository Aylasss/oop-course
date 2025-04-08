package lesson16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exam implements Gradable{
    public String examId;
    public Course course;
    public double maxScore = 0;
    public Map<Student, Double> scores = new HashMap<>();

    public Exam(String examId, Course course) {
        this.examId = examId;
        this.course = course;
    }

    @Override
    public void recordScore(Student student, double score){
        if (!course.contains(student)) {
            throw new IllegalArgumentException("Student not enrolled in course");
        }
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Invalid value");
        }

        scores.put(student, score);
        if (score > maxScore) {
            maxScore = score;
        }
    }

    @Override
    public double calculateAverageScore() {
        if (scores.isEmpty()) return 0.0;

        double sum = 0;
        for (Double score : scores.values()) {
            sum += score;
        }
        return sum / scores.size();
    }

    @Override
    public double getMaxScore() {
        return maxScore;
    }

    public List<Student> getTopStudents() {
        List<Student> topStudents = new ArrayList<>();
        if (scores.isEmpty()) return topStudents;

        for (Student student : scores.keySet()) {
            if (scores.get(student) == maxScore) {
                topStudents.add(student);
            }
        }
        return topStudents;

    }



}




