package clean.code.design_patterns.requirements;

public class Notification {
    Grade grade;

    public Notification(Grade grade) {
        this.grade=grade;
    }
    public String toString(){
        return grade.getStudent()+" a obtinut la cursul de "+grade.getCourse()+" nota :" +grade.getScore();
    }
}
