package clean.code.design_patterns.requirements;

public class Grade {
    private Double score;
    private Student student;
    private String course; // Numele cursului
    public Notification notification;

    public Grade() {

    }

    public Grade(Double score, Student student, String course) {
        this.score=score;
        this.student = student;
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public String toString() {
        return String.valueOf(score);
    }
}
