package lesson16;

public interface Gradable {
    void recordScore(Student student, double score);
    double calculateAverageScore();
    double getMaxScore();
}
