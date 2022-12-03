package code._4_student_effort.challenge_2;

public class Actor {
    private String actorName;
    private int age;
    private Prize[] prizes;

    Actor(String inputName, int inputAge, Prize[] prizes) {
        actorName = inputName;
        age = inputAge;
        this.prizes = prizes;
    }

    public String getActorName() {
        return actorName;
    }

    public int getActorAge() {
        return age;
    }
}
