package code._4_student_effort.pairs;

public class Main {
    public static void main(String[] args) {
        Running runningShoe1 = new Running("RED", 41);
        Running runningShoe2 = new Running("RED", 41);
        Running runningShoe3 = new Running("BLACK", 41);
        Boot bootShoe = new Boot("BLACK", 45);

        //Pair<Running> pairOK = new Pair<>(runningShoe1, bootShoe);
        Pair<Running> pairOK = new Pair<>(runningShoe1, runningShoe2);
        System.out.println(pairOK);
        Pair<Running> pairNotOK = new Pair<>(runningShoe1, runningShoe3);

    }
}
