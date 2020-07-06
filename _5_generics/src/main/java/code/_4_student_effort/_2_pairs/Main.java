package code._4_student_effort._2_pairs;

public class Main {
    public static void main(String[] args) {
        Running runningShoe1 = new Running("RED", 41);
        Running runningShoe2 = new Running("RED", 41);

        Pair<Running> pairOK = new Pair<>(runningShoe1, runningShoe2);

        Running runningShoe3 = new Running("RED", 41);
        Boot boot = new Boot("BLACK", 45);
        //Pair<Running> pairOKK = new Pair<>(runningShoe3, boot);
    }
}
