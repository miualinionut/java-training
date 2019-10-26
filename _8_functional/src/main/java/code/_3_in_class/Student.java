package code._3_in_class;

public class Student {
    int gradYear;
    double score;
    String firstName;

    public Student(int gradYear, double score) {
        this.gradYear = gradYear;
        this.score = score;
    }

    public Student(int gradYear, double score, String firstName) {
        this.gradYear = gradYear;
        this.score = score;
        this.firstName = firstName;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}

